SUMMARY = "Qt Frontend for Marble"
DESCRIPTION = "The Qt frontend for the Marble map viewer"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-qt-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f581c853cb810298edbc638ced7e4fbb9a648f5edeeefdabbd9e642e0a041882ee538ca45071635615349ac001f46dc3ee585125ef07ae6a44b71030535b186c"

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
