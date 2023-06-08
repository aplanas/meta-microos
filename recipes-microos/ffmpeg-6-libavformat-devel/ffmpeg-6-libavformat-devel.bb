SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavformat-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "06efd347595b5eb5ed1876faaf1742277656ce19ac929b39c6152ea25952f5fa30d50ee5ced3e8b5afa9a737e1628baa439cf506c3f00d3a1254b5a07b461eb9"

RPROVIDES:${PN} += "ffmpeg-6-libavformat-devel ffmpeg-6-libavformat-devel(aarch-64) libavformat-devel pkgconfig(libavformat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavcodec-devel ffmpeg-6-libavutil-devel ffmpeg-6-libswresample-devel libavformat60 pkgconfig(libavcodec) pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
