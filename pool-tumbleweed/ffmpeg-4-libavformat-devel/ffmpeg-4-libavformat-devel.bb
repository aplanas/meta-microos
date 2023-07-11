SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavformat-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "c58027b5d1dd0abe93ca2214a07a7267e77a6f75dadad036a989c5a69e927b79c9834f0495b15477dcaebf64a5330cd5d2648f7af8cd6971741deeb6a4a888d8"

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
