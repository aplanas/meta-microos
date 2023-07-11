SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavformat-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "28ab6c24ba5562f35ea9cb4b9a95608f92ae5eafe565fb49be121791b1e51d14c7a9011960d42c1c60a3770622b2d3425a0e2c0901c28f5174ab910fe8a3ebc3"

RPROVIDES:${PN} += "ffmpeg-6-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavcodec-devel \
ffmpeg-6-libavutil-devel \
ffmpeg-6-libswresample-devel \
libavformat60 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
