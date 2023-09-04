SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickwidgets-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2c1dac066fc1fc984fb86ae8e1dbd849de674741fbd51bdc3bd22f8f4fc047ca384873944c44bf646595594c00c1a416c5587b3b5bc65d2864d031335db2445c"

RPROVIDES:${PN} += "cmake-Qt6QuickWidgets \
pkgconfig-Qt6QuickWidgets \
qt6-quickwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Widgets \
libQt6QuickWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Widgets"

inherit rpm
