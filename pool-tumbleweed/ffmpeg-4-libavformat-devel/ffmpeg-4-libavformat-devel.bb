SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavformat-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "05958a0e5af057f1d6dad97960063d0008c81f30144065076ed80aac1a3822e692eea8f978a9f699ca4f5a804865c9919776742b84ca1c13a25ed04ce2d3961d"

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
