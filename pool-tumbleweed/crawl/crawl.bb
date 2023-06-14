SUMMARY = "Roguelike dungeon exploration game"
DESCRIPTION = "Crawl is a fun game in the grand tradition of games like Rogue, Hack, and Moria. \
Your objective is to travel deep into a subterranean cave complex and retrieve the Orb of Zot, \
which is guarded by many horrible and hideous creatures. \
 \
This is the Stone Soup version of Dungeon Crawl. \
 \
Note: You need to be in the 'games' group in order to play the game."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "crawl-0.28.0-1.5.aarch64.rpm"
RPM_HASH = "a575691540bfba6f1dfb3803f8ab05b48d75b8df6c0aec00ac1d162d0411f48f8742c40180728c6e10fb78a009b0dfc0d24777a37e47b884496d7f91284bc5f9"

RPROVIDES:${PN} += "crawl"

RDEPENDS:${PN} += "/bin/sh \
crawl-data \
group-games \
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
libz.so.1 \
user-games"

inherit rpm
