SUMMARY = "Development files for the Qt 6 3DQuickRender library"
DESCRIPTION = "Development files for the Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickrender-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "eb4ffbbaf085912fd648195ff6584cff47fdd43adf48a3c39bf92afd29cff43a873ed2ab7de3f35b0da99cc2bbcb84e77ba74a19c93af5ff74b44675183da667"

RPROVIDES:${PN} += "cmake-Qt63DQuickRender \
pkgconfig-Qt63DQuickRender \
qt6-3dquickrender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickRender6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
