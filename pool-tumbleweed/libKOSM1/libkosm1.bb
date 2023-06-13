SUMMARY = "OSM primitives for kosmindoormap"
DESCRIPTION = "OSM primitives for kosmindoormap."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "libKOSM1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3a3dc6344b44fb3911c28b8f7bb7eb3afe6a6c647203e16ed638dc59ae7fe640dee2d41ef1259e8d149de79d029ae52bf61295e23a46e5315d292d18c6ab60ae"

RPROVIDES:${PN} += "libKOSM.so.1()(64bit) \
libKOSM1 \
libKOSM1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
