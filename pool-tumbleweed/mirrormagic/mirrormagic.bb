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

RPM_NAME = "mirrormagic-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "2f049c7374898b4adeb8a7122342ec9c60ed311108f4f735fe047eee0b1971f58ada0c78d96af8d8c8b41aa68a6f00cb0741498850f3d7898c3849d4c1d5d49a"

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
