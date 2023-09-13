SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavformat-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "c01f7da8ea19f15d4d867b93e751d2a24b3f992818706cbd375836cece72df6528ce4d1087837b877d0200b9f336e1e34d0e1d1fc2b97f47b229c2c7e19db4d4"

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
