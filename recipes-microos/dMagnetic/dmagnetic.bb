SUMMARY = "An interpreter for Magnetic Scrolls games"
DESCRIPTION = "An interpreter for games produced by the studio Magnetic Scrolls. It \
can be used to play 'The Pawn', 'The Guild of Thieves', 'Jinxter', \
'Fish!', 'Myth', 'Corruption' and 'Wonderland'."
LICENSE = "BSD-2-Clause"

PV = "0.35"

RPM_NAME = "dMagnetic-0.35-1.3.aarch64.rpm"
RPM_HASH = "284c1f06f5ebdcc5a36298047a661351086718c51df8a99461b2a2c2c6d94d607f6740f32b3559bdaa22b0beba2f412ac9a2d4080e32a8425bc55e18eebb955c"

RPROVIDES:${PN} += "dMagnetic dMagnetic(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
