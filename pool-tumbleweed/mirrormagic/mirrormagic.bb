SUMMARY = "Puzzle game where you steer a beam of light using mirrors"
DESCRIPTION = "This is a nice little game with color graphics and sound for your \
Unix system with color X11. You need an 8-bit color display or better. \
It will not work on black&white systems, and maybe not on gray scale \
systems. \
 \
It was first released as 'Mindbender' in the year 1989 on the Amiga \
(with ports on other computer systems) and is in fact a clone of the \
C64 game 'Deflektor'."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "mirrormagic-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "6fcc3e47835acbd3b929fa62cfa3629b93057b5070f953793a11f75a1c50b553a92c5f84e14c6d6695a5601ec15e575a0ec004b7e402a9e1dd04044ea4b17960"

RPROVIDES:${PN} += "mirrormagic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
