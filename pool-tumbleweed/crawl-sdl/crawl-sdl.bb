SUMMARY = "Roguelike dungeon exploration game (SDL version)"
DESCRIPTION = "Crawl is a fun game in the grand tradition of games like Rogue, Hack, and Moria. \
Your objective is to travel deep into a subterranean cave complex and retrieve the Orb of Zot, \
which is guarded by many horrible and hideous creatures. \
 \
This is the (SDL-based) tiled Stone Soup version of Dungeon Crawl. \
 \
Note: You need to be in the 'games' group in order to play the game."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "crawl-sdl-0.28.0-1.6.aarch64.rpm"
RPM_HASH = "64efef810cc46ccb0bc1143241070dec81f13646f6f8790dc61fc210f406bfa2e7fe463a8069c97fe4268839e7bd3aaf14980d2ed74f10ca51e685176a00dcda"

RPROVIDES:${PN} += "crawl-sdl"

RDEPENDS:${PN} += "crawl \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
liblua5.1.so.5 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
