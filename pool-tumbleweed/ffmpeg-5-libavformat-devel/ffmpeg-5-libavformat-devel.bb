SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavformat-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "c0dd734d50e9cea0e206e5c64c6bf5d3b63c50f459465039a53fb3debd8612dd49a019382bebaf99f614c72d507558ae0d59a01b5c5f4cb7235e947b60f84cd4"

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
