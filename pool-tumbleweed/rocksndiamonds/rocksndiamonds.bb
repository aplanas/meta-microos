SUMMARY = "Colorful Boulderdash'n'Emerald Mine'n'Sokoban'n'Stuff"
DESCRIPTION = "This is a nice little game with color graphics and sound for your Unix system \
with color X11.  You need an 8-Bit color display or better.  It will not work \
on black&white systems, and maybe not on gray scale systems. \
 \
If you know the game Boulder Dash (Commodore C64) or Emerald Mine (Amiga), \
you know what Rocks'n'Diamonds is about."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.6.0"

RPM_NAME = "rocksndiamonds-4.3.6.0-1.1.aarch64.rpm"
RPM_HASH = "3c5ab623bad712f5bb1eeed88cccd9097eeaee5fe5683a8f792fb4bd6b14363f2ad3666621f2642f2463d1993c8ea6981b895f032216d861da1f750a27cbb2bd"

RPROVIDES:${PN} += "rocksndiamonds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
rocksndiamonds-data \
user-games"

inherit rpm
