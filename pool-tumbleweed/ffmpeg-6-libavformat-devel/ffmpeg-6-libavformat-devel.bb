SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavformat-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "3f309dbc00b5e660feeaabf06f8dbaa857ba840c2eb41ff5fa1241f410fe892cb1e797cc65808045e37ff3432fbac3466482a91923524e084f3d94fe0d24564a"

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
