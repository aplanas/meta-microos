SUMMARY = "Realtime strategy game involving map control"
DESCRIPTION = "Widelands is a real-time strategy (RTS) game with singleplayer \
campaigns and a multiplayer mode. The game was inspired by Settlers II \
(Bluebyte) but has significantly more variety and depth to it. \
 \
The primary goal of this type of RTS is to build a settlement with a \
functioning economy, producing sufficient military units so as to \
conquer rival territories, ultimately gaining control of either the \
entire map, or a certain predetermined section of it."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "widelands-1.1-3.2.aarch64.rpm"
RPM_HASH = "7d5b0e50c59deccad594d1f3b400defe87aac96728f1fc7ca4de3508235413734697fd0e4e45e0d60a3bd09531f0ab43b58bec8e806885c93c2ce668a57d74a3"

RPROVIDES:${PN} += "application() \
application(org.widelands.Widelands.desktop) \
metainfo() \
metainfo(org.widelands.Widelands.appdata.xml) \
widelands \
widelands(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
widelands-data"

inherit rpm
