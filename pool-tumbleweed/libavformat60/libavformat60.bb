SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavformat60-6.0-3.1.aarch64.rpm"
RPM_HASH = "08803a2144b82f3283c3f799957544fa68568280a7555c1d16a26dc7c21e081b3208de0c90b62703aa6353e63011f0d26af95ef86e02e2b94e0b854e43b4f1c2"

RPROVIDES:${PN} += "libavformat.so.60 \
libavformat60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavcodec60 \
libavutil.so.58 \
libavutil58 \
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
