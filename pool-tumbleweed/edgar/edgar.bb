SUMMARY = "2D platform game with a persistent world"
DESCRIPTION = "The Legend of Edgar is a platform game, not unlike those found on the Amiga and \
SNES. Edgar must battle his way across the world, solving puzzles and defeating \
powerful enemies to achieve his quest. \
 \
A 2D platform game with a persistent world. \
When Edgar's father fails to return home after venturing out one dark and stormy \
night, Edgar fears the worst: he has been captured by the evil sorcerer who \
lives in a fortress beyond the forbidden swamp. \
 \
Donning his armour, Edgar sets off to rescue him, but his quest will not be \
easy..."
LICENSE = "GPL-2.0-or-later"

PV = "1.36"

RPM_NAME = "edgar-1.36-1.3.aarch64.rpm"
RPM_HASH = "7666a7b05d732be88eb617bfba220d066abc251ff6baa2fe27809fa2d38186d060c7ea85b7f30fa0d3ad564b78096713065c1ca26c1848a9bff88aa400f61653"

RPROVIDES:${PN} += "application() \
application(edgar.desktop) \
edgar \
edgar(aarch-64) \
metainfo() \
metainfo(edgar.appdata.xml)"

RDEPENDS:${PN} += "edgar-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
