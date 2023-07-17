SUMMARY = "Development files for the Qt 6 3DQuickRender library"
DESCRIPTION = "Development files for the Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickrender-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e60fcfa5fa6deb0d50cd6301249f649119065d4b64056f05962ed0e1b368526414f34a2bbd6174fb796f33f2ae102336333856953c8230dcb913240b644fdd98"

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
