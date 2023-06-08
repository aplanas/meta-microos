SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavformat-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "91c9de09e135d2ee6e21846ce62f23c3e6e10773e60b4445c41b8b777e58704504040eff58569047e9fa2ac1512d71cb55480fe0a7460cd42142a664074a86fa"

RPROVIDES:${PN} += "ffmpeg-5-libavformat-devel ffmpeg-5-libavformat-devel(aarch-64) libavformat-devel pkgconfig(libavformat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavcodec-devel ffmpeg-5-libavutil-devel ffmpeg-5-libswresample-devel libavformat59 pkgconfig(libavcodec) pkgconfig(libavutil) pkgconfig(libswresample)"

inherit rpm
