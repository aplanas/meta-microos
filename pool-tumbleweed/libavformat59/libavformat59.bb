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

RPM_NAME = "libavformat59-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "2d534d4f682668a8ea0e2848f3851010f2fe6a39c3bac3bb5f640c42892605b3b1a8ec68c8d7fbe24b29a6b5b85ba1b3f9149a126e5bb04d745ca8b551085aeb"

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
