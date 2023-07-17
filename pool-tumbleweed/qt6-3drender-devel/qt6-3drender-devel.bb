SUMMARY = "Development files for the Qt 6 3DRender library"
DESCRIPTION = "Development files for the Qt 6 3DRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3drender-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "eb5fae26e36afc1f3fcaa36536486baefa5ac490324a913786dcf7eebd6313afc56d2939a180b3290f8171df3ea4cd042b5a67af9e4729bdd28394f08e900a4c"

RPROVIDES:${PN} += "cmake-Qt63DRender \
pkgconfig-Qt63DRender \
qt6-3drender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Concurrent \
cmake-Qt6OpenGL \
libQt63DRender6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6OpenGL"

inherit rpm
