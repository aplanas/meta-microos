SUMMARY = "Innovative 3D real-time strategy"
DESCRIPTION = "You command the forces of 'The Project' in a battle to rebuild \
the world after mankind has almost been destroyed by nuclear \
missiles. \
 \
The game offers campaign, multi-player and single-player skirmish \
modes. An extensive tech tree with over 400 different \
technologies, combined with the unit design system, allows for \
a wide variety of possible units and tactics. \
 \
Warzone 2100 was originally developed as a commercial game by \
Pumpkin Studios and published in 1999, and was released as \
open source by them in 2004, for the community to continue \
working on it. \
 \
This package provides the binaries for Warzone 2100."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-3.0-or-later & CC0-1.0 & LGPL-2.1-only"

PV = "4.3.5"

RPM_NAME = "warzone2100-4.3.5-2.1.aarch64.rpm"
RPM_HASH = "a16be47feff842f866febc7fa4a3524aba6f7fbe08653bac67e70464c91d585680dc8ae1e24c463e968e374c96816b545dbbe63f884fe3ab80af4f23d55e32e5"

RPROVIDES:${PN} += "warzone2100"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libharfbuzz.so.0 \
libm.so.6 \
libminiupnpc.so.17 \
libogg.so.0 \
libopenal.so.1 \
libopus.so.0 \
libphysfs.so.1 \
libpng16.so.16 \
libsodium.so.23 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtheoradec.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libz.so.1 \
warzone2100-data"

inherit rpm
