SUMMARY = "Files to develop against libmpg123"
DESCRIPTION = "The mpg123 distribution contains an MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1, 2 and 3 (most commonly MPEG 1.0 Layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-devel-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "ed56be99b33403400a3c19af2c5bc7d451514b10c473886dbb97dfaad65584486192313335f6eca94a1db0e5e5143cc3f510447b8c67fd8d8eca09a43e2f6c7c"

RPROVIDES:${PN} += "mpg123-devel \
pkgconfig-libmpg123 \
pkgconfig-libout123 \
pkgconfig-libsyn123"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpg123-0 \
libout123-0 \
libsyn123-0"

inherit rpm
