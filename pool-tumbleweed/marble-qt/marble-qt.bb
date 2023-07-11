SUMMARY = "Qt Frontend for Marble"
DESCRIPTION = "The Qt frontend for the Marble map viewer"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "marble-qt-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "be79f5f716426ebb7ab5cae326b94be0e71ae8f72fc348482393d504f71c26c22e6dbf1558152aedb6a4f200eeecfec73785d9f46bbe7fa545dd3c2f23ecb073"

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
