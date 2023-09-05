SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "OSM multi-floor indoor map renderer library."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "libKOSMIndoorMap1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "38cfda179d102e21b8e45315b8d2f12e5ba497a974c1725a16d608f85784e5cba7a9c70f4a43fe8a6aa1089be15141cc4729b292938893adfdc6308f41393ac6"

RPROVIDES:${PN} += "libKOSMIndoorMap.so.1 \
libKOSMIndoorMap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKOSM.so.1 \
libKOpeningHours.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
