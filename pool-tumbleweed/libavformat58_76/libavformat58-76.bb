SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavformat58_76-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "99e8c2babcc64a9620557accbb6d64b506de5a22313f0d64b60eacc10949c22642cccee806d1aa538e871962b0d883d90cb10dc87f7abadfbd5206670df164e6"

RPROVIDES:${PN} += "libavformat.so.58.76 \
libavformat58-76"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavutil.so.56.70 \
libavutil56-70 \
libbluray.so.2 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
libm.so.6 \
libopenmpt.so.0 \
libsrt.so.1.5 \
libssh.so.4 \
libxml2.so.2 \
libz.so.1 \
libzmq.so.5"

inherit rpm
