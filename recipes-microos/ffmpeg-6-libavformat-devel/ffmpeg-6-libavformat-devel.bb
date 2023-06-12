SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavformat-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "f92fd9a6ee527f92c498699c8944deb1fde4311fef81aa57a0fac30eaf77f4aff681d0bed059a7e0cb8a5f483eb259a193ed670191867a9417df6e021051703b"

RPROVIDES:${PN} += "ffmpeg-6-libavformat-devel ffmpeg-6-libavformat-devel(aarch-64) libavformat-devel pkgconfig(libavformat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavcodec-devel ffmpeg-6-libavutil-devel ffmpeg-6-libswresample-devel libavformat60 pkgconfig(libavcodec) pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
