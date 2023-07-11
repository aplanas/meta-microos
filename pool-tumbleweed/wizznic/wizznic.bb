SUMMARY = "Implementation of the arcade classic Puzznic"
DESCRIPTION = "Wizznic is a brick-matching puzzle-game, an improved version of Puzznic. \
The challenge is to clear each level of bricks by moving the bricks next \
to each other, this sounds a lot easier than it is. \
The bricks are heavy, so you can only push them, not lift them up."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "wizznic-1.1-1.14.aarch64.rpm"
RPM_HASH = "0756c0a48d66f58a5e9a9b5c7d515d516a40272c3c1cc2b433c8ccca20230e4acded27babe9aad71cce2feda75b943156cef0d78b9387424a34dfd4485f169e9"

RPROVIDES:${PN} += "wizznic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
