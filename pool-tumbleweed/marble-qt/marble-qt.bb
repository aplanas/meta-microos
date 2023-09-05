SUMMARY = "Qt Frontend for Marble"
DESCRIPTION = "The Qt frontend for the Marble map viewer"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "marble-qt-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8109799c4f976ba57245aad6cd7183a8f74b582c56e9065df1feef9c9435ebb9d2f4addf32e1e7fc44b140d74a505e874cdf05cabb6ee85de46b99890a957b8d"

RPROVIDES:${PN} += "marble-frontend \
marble-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmarblewidget-qt5.so.28 \
libstdc++.so.6 \
marble"

inherit rpm
