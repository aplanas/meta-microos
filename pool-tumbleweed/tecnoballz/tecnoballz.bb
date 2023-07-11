SUMMARY = "A brick breaking game"
DESCRIPTION = "A brick breaker with 50 levels of game and 11 special levels, \
distributed on the 2 modes of game to give the player a sophisticated system \
of attack weapons with an enormous firepower that can be built by \
gaining bonuses.  Numerous decors, music and sounds complete this \
game. This game was ported from the Commodore Amiga."
LICENSE = "GPL-3.0-only"

PV = "0.93.1"

RPM_NAME = "tecnoballz-0.93.1-5.2.aarch64.rpm"
RPM_HASH = "764f1d3e4f69a3b8c6f84da7cfcbf86040f5530cfa63b07cce57e8b218261fe2e6a9b95a3b8736a985d32191ded8b84084e3a8661f65bf3965e0b33b31656a66"

RPROVIDES:${PN} += "tecnoballz"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmikmod.so.3 \
libstdc++.so.6 \
libtinyxml.so.0"

inherit rpm
