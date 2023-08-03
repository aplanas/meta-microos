SUMMARY = "Development files for the Qt 6 3DQuickExtras library"
DESCRIPTION = "Development files for the Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickextras-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b51e8d206c7e43aa7d57b126b89fecba845826c5e4a44000ca567fcf2d550126b16327f60ab6068b60dcacae4ca31b44f58a4e38d3bfab7925ba17fab6975218"

RPROVIDES:${PN} += "cmake-Qt63DQuickExtras \
pkgconfig-Qt63DQuickExtras \
qt6-3dquickextras-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DExtras \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickExtras6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DExtras \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
