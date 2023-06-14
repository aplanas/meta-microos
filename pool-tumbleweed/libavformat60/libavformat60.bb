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

RPM_NAME = "libavformat60-6.0-2.2.aarch64.rpm"
RPM_HASH = "bb5d33264b05d734a3f842161cf1d05bb8717b06080a9e6acde6ae8f6062b4db6eaf958e23c030b222c54e0984a61a498a5a94516b5f882b54d6b47e61052148"

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
