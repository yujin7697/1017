package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Board;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
public class BoardDto {
    private Long number;
    private String nickname;
    private String contents;
    private String profile;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;
    private Long hits;
    private Long like_count;
    private MultipartFile[] files;

    public static BoardDto Of(Board board) {
        BoardDto dto = new BoardDto();
        dto.number = board.getNumber();
        dto.nickname=board.getNickname();
        dto.contents = board.getContents();
        dto.profile = board.getProfile();
        dto.date = board.getDate();
        dto.hits = board.getHits();
        dto.like_count  = board.getLike_count();
        return dto;
    }

}