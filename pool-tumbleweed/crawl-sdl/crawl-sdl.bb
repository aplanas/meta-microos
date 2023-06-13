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

RPM_NAME = "crawl-sdl-0.28.0-1.5.aarch64.rpm"
RPM_HASH = "643103a9a327cdcb37bcacded82f41846aa7942f8d8235d764181429384a49211d82d5b5a06a6a8e42e218f0a2d882e528a7de51570df1bf4239485999b74987"

RPROVIDES:${PN} += "application() \
application(crawl.desktop) \
crawl-sdl \
crawl-sdl(aarch-64) \
metainfo() \
metainfo(crawl.appdata.xml)"

RDEPENDS:${PN} += "crawl \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
