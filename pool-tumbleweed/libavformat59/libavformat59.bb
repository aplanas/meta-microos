SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavformat59-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "ee78f8780d18f3f86fcb2a49b96826a1a1ba102b2c17d8a6e5afa2dd323bb5c2e91883621a04228a35ed55e5d38b385db87c1c2cfd4df0b8f54ec605281024f7"

RPROVIDES:${PN} += "libavformat.so.59 \
libavformat59"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.59 \
libavcodec59 \
libavutil.so.57 \
libavutil57 \
libbluray.so.2 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
libm.so.6 \
libopenmpt.so.0 \
librist.so.4 \
libsrt.so.1.5 \
libssh.so.4 \
libxml2.so.2 \
libz.so.1 \
libzmq.so.5"

inherit rpm
