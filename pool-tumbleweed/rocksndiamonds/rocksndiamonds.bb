SUMMARY = "Colorful Boulderdash'n'Emerald Mine'n'Sokoban'n'Stuff"
DESCRIPTION = "This is a nice little game with color graphics and sound for your Unix system \
with color X11.  You need an 8-Bit color display or better.  It will not work \
on black&white systems, and maybe not on gray scale systems. \
 \
If you know the game Boulder Dash (Commodore C64) or Emerald Mine (Amiga), \
you know what Rocks'n'Diamonds is about."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.4.0"

RPM_NAME = "rocksndiamonds-4.3.4.0-1.3.aarch64.rpm"
RPM_HASH = "e95f9891ff0908c6f0238dd11400e03748e744e076bbfd151442dd3a7cd852b32f8aad6e036f4be6a543e6798266aea1479ef01906b5668c92f40cb771b3785b"

RPROVIDES:${PN} += "application() \
application(rocksndiamonds.desktop) \
rocksndiamonds \
rocksndiamonds(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.14)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
rocksndiamonds-data \
user(games)"

inherit rpm
