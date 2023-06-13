SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "libout123-0-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "80097bf0339c3d1ca0ff0570398e5c4fde0b64713a6b1ab269f4411be99e03140249b5898336a8053e1e840cef9af6d65c0754c6f236465104ded79cf33125dc"

RPROVIDES:${PN} += "libout123-0 \
libout123-0(aarch-64) \
libout123.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
