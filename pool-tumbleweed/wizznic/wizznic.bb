SUMMARY = "Implementation of the arcade classic Puzznic"
DESCRIPTION = "Wizznic is a brick-matching puzzle-game, an improved version of Puzznic. \
The challenge is to clear each level of bricks by moving the bricks next \
to each other, this sounds a lot easier than it is. \
The bricks are heavy, so you can only push them, not lift them up."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "wizznic-1.1-1.13.aarch64.rpm"
RPM_HASH = "8aff345defcbce5662b268b2b8e819ea273891c71b45bb8e3e36ac52ef9064954bf825f108b36318f2d9199f0e21882326e89eb0f4fef5cb01bbc1ad5045f2c1"

RPROVIDES:${PN} += "wizznic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
