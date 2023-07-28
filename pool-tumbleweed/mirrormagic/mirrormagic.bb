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

PV = "3.3.0"

RPM_NAME = "mirrormagic-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "c131bb18be649a00306c55d56464d6b73f2c61bd8b3bb11eeae86cc8421badc4e674b7ed095b04e8a380b3b2fb41624606c44397df3a61f87e1ee171dfdc8158"

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
