SUMMARY = "Library for analyzing sound and recommending volume change"
DESCRIPTION = "libreplaygain is a library that analyzes input samples and gives the \
recommended volume change."
LICENSE = "LGPL-2.1-or-later"

PV = "r475"

RPM_NAME = "libreplaygain1-r475-2.14.aarch64.rpm"
RPM_HASH = "680d771065cb11a023af43f973576dd1166cc55c576a39da0224db12e114de54a2df0d6ac2cdeaa1df8700c5ea34b663f830dacc726094cf8a9e97b8857c4e04"

RPROVIDES:${PN} += "libreplaygain.so.1()(64bit) \
libreplaygain1 \
libreplaygain1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
