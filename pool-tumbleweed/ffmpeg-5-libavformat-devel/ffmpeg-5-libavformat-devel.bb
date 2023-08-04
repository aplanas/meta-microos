SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavformat-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "e14fb33e0964117f0ce213554e516d8eeb9c8e5891c03b94f3feff8091e84b1dfb83ce855e9863e121f00c8f5c341f98b335c38642faedfd9366bce84856623d"

RPROVIDES:${PN} += "ffmpeg-5-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavutil-devel \
ffmpeg-5-libswresample-devel \
libavformat59 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
