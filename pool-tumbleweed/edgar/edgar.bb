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

RPM_NAME = "edgar-1.36-1.4.aarch64.rpm"
RPM_HASH = "72f9b646540b5f97242b2314c496673bec652431a16d2c60c2e95c624343ed4615c09fdedc37350fcc785ed1f77618d98bb17e23dfc0e6c14c2a391781080d65"

RPROVIDES:${PN} += "edgar"

RDEPENDS:${PN} += "edgar-data \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
