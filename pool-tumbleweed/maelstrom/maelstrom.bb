SUMMARY = "High Quality Asteroids Clone"
DESCRIPTION = "You are on space patrol. Blast asteroids, fight UFOs, and get extra \
weapons. Beware of supernovae and black holes. \
 \
A port of the high resolution, fast action Asteroids-style \
Mac game Maelstrom originally written by Ambrosia Software. \
Unique to this port is a kick-butt network play mode."
LICENSE = "GPL-2.0+ & CC-BY-3.0"

PV = "3.0.6"

RPM_NAME = "maelstrom-3.0.6-3.24.aarch64.rpm"
RPM_HASH = "8ca2258901848250acac348a6cdf28019c6ed3db5b0d487cac374654b198434117072e5e04c000b674aa2a92d6fcb624930a1fa78db949df0487e640328478c9"

RPROVIDES:${PN} += "Maelstrom \
application() \
application(maelstrom.desktop) \
maelstrom \
maelstrom(aarch-64) \
metainfo() \
metainfo(maelstrom.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_net-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
