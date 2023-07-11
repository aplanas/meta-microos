SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "libout123-0-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "abe32e0d415863bb21dd9f6399fb05e5eb5f72ec93adad64b5fe13a8f7fb06300f9969b6c74161e7193d72c0d418cf72a31fed803810d68591893d81bd3c7aed"

RPROVIDES:${PN} += "libout123-0 \
libout123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
