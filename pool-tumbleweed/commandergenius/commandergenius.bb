SUMMARY = "An open clone of the Commander Keen engines"
DESCRIPTION = "Commander Genius is a software piece that interprets the Commander \
Keen Vorticon (1-3) and Galaxy (3½-6) series. \
 \
It has 4-player cooperative mode and six difficulty modes."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "commandergenius-3.2.0-2.1.aarch64.rpm"
RPM_HASH = "d4418ab66f4bb68e743d394cd04495c42b44a86750a44c1e1dbd6c8c6cad0066e07f8d11fa3c0c7a33229d7c00f4a367beeb4a2025d34241211b8d458e37e416"

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
