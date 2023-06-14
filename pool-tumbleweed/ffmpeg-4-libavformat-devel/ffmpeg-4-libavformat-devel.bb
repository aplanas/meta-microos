SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavformat-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "3460173f803a2af1883dbcfae7633e362078b398da38aa2a24b225adc6d5aae5de324af1eff846203e821bf728a5f54e56579b1b072eababdf43718c0f21cde5"

RPROVIDES:${PN} += "ffmpeg-4-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavutil-devel \
ffmpeg-4-libswresample-devel \
libavformat58-76 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
