SUMMARY = "A brick breaking game"
DESCRIPTION = "A brick breaker with 50 levels of game and 11 special levels, \
distributed on the 2 modes of game to give the player a sophisticated system \
of attack weapons with an enormous firepower that can be built by \
gaining bonuses.  Numerous decors, music and sounds complete this \
game. This game was ported from the Commodore Amiga."
LICENSE = "GPL-3.0-only"

PV = "0.93.1"

RPM_NAME = "tecnoballz-0.93.1-5.1.aarch64.rpm"
RPM_HASH = "a0b29ce2e8af67b6eff8db5ed5fa9a26ba6b499503593312aec8b84178bc8f9b85dde7c9e982efe5916bf3bfebf35cf2a02a4020c61b2d53958966cdb92ceb74"

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
