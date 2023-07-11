SUMMARY = "Console MPEG audio player and decoder library"
DESCRIPTION = "The mpg123 distribution contains an MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1, 2 and 3 (most commonly MPEG 1.0 Layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "e15b6b07411d3b6375a0230baf7900aacad5ced1da142100c1e05ec72e5f31e25a0924c6ca270c0303be6417dc06715f6a7d43e70f552f6cba1f4303ca874cdf"

RPROVIDES:${PN} += "mpg123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libmpg123.so.0 \
libout123.so.0 \
libsyn123.so.0"

inherit rpm
