SUMMARY = "Development files for the Qt 6 3DLogic library"
DESCRIPTION = "Development files for the Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dlogic-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "97c675f4d99b814606d140f18b44de6c1ba56662a4bd3011db16f7a64cfb4d094b14cd9fa17b2ac1c4386d3668036e77dfc54c52d15843d799a4fa9cfdb2b1f8"

RPROVIDES:${PN} += "cmake-Qt63DLogic \
pkgconfig-Qt63DLogic \
qt6-3dlogic-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
libQt63DLogic6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
