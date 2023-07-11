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

RPM_NAME = "crawl-0.28.0-1.6.aarch64.rpm"
RPM_HASH = "c0aa9f254cfcddc019d1b33e21da6b238983c4d1dfb3b743e7237af18ed132a464b652bdc075d31777e332607c74f4d7d7100983a707195a098d7e7f5e4c0eea"

RPROVIDES:${PN} += "crawl"

RDEPENDS:${PN} += "/usr/bin/sh \
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
