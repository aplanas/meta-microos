SUMMARY = "Development files for the Qt 6 3DQuickExtras library"
DESCRIPTION = "Development files for the Qt 6 3DQuickExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickextras-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "81ad5e809b7cd25e962d3bbaf30a0a4c36cbedb921fdcb397a8ad8683eebf397df096e6e88315d14380f5a3806f33ec2f69559dcd987c3c1e1c7b229b87e9370"

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
