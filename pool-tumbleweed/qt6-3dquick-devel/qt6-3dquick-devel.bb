SUMMARY = "Development files for the Qt 6 3DQuick library"
DESCRIPTION = "Development files for the Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquick-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2a735c286fca08b6600b6b1fa5717922cfc6181cae60fdaeef5453633cd33a8290e4af34e8f9cb31fa773310efbf2b6901b3de70e833674a5cbe667226a0e9d4"

RPROVIDES:${PN} += "cmake-Qt63DQuick \
pkgconfig-Qt63DQuick \
qt6-3dquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt63DQuick6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-3dcore-private-devel"

inherit rpm
