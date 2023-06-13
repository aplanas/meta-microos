SUMMARY = "An open clone of the Commander Keen engines"
DESCRIPTION = "Commander Genius is a software piece that interprets the Commander \
Keen Vorticon (1-3) and Galaxy (3½-6) series. \
 \
It has 4-player cooperative mode and six difficulty modes."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "commandergenius-3.2.0-2.1.aarch64.rpm"
RPM_HASH = "d4418ab66f4bb68e743d394cd04495c42b44a86750a44c1e1dbd6c8c6cad0066e07f8d11fa3c0c7a33229d7c00f4a367beeb4a2025d34241211b8d458e37e416"

RPROVIDES:${PN} += "application() \
application(cgenius.desktop) \
commandergenius \
commandergenius(aarch-64) \
metainfo() \
metainfo(io.sourceforge.clonekeenplus.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
