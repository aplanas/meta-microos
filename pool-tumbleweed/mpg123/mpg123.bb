SUMMARY = "Console MPEG audio player and decoder library"
DESCRIPTION = "The mpg123 distribution contains an MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1, 2 and 3 (most commonly MPEG 1.0 Layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "6333ebeeb4ba6c5084175c27cf7ab7093c28c220d0634271a4b8898a76f89469d278aa110e32faed67e8c38593b3add0f9ca2244d2d5fc7f171973293c0a3d09"

RPROVIDES:${PN} += "mpg123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libmpg123.so.0 \
libout123.so.0 \
libsyn123.so.0"

inherit rpm
