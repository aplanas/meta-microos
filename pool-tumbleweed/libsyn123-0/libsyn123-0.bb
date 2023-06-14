SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "libsyn123-0-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "a94cea5da65c2e2322743dacf2957498231e2729e60ef7d81a71dbfae89e84b13e297297584d44a6583d9b7e12ccaef5f9cedcb799fec275d856113b8c037c31"

RPROVIDES:${PN} += "libsyn123-0 \
libsyn123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
