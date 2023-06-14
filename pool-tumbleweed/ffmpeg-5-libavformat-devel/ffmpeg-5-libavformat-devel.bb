SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavformat-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "d54288d8cb86f5fa90eacdece05aa1d37aafccfa7cf35c821d4d06b16795f8c4fc220447421dd0720aea91cc2789e44bbf39fdb329850a2ef17d0238394a43bf"

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
