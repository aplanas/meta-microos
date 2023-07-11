SUMMARY = "An open clone of the Commander Keen engines"
DESCRIPTION = "Commander Genius is a software piece that interprets the Commander \
Keen Vorticon (1-3) and Galaxy (3½-6) series. \
 \
It has 4-player cooperative mode and six difficulty modes."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "commandergenius-3.2.0-2.2.aarch64.rpm"
RPM_HASH = "8ecc0a3a129ef9835b6844cac6d871dbeaa27589e7fd656111167ee5647d4cc8411ef11e15b641dbf000a6e533d010b3e74bb4c9e799aa6e579f05968c0fff2a"

RPROVIDES:${PN} += "commandergenius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
