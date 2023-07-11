SUMMARY = "Qt5 qhexedit2 library"
DESCRIPTION = "Qt5 library for qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "libqhexedit4-0.8.9-1.16.aarch64.rpm"
RPM_HASH = "014461acbf2e7e2335c166df8d11c8c43ffa80fa3ad66d9df2d250dcab69e1db7baac43adfce892880c29daf934ea1e1ca45abcf01fbdac3334e1a63968f1514"

RPROVIDES:${PN} += "libqhexedit.so.4 \
libqhexedit4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
