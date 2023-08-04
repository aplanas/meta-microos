SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswresample4-6.0-3.1.aarch64.rpm"
RPM_HASH = "85b28e7cee8e42bab96b8a145ae3ce063027e67c4da3dc038785c04c3353fc57d2005d877c58623ef22827fb7b2f21577fab30c6a983d106315473b2b85ada5c"

RPROVIDES:${PN} += "libswresample.so.4 \
libswresample4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
