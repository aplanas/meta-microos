SUMMARY = "Development files for the Qt 6 3DCore library"
DESCRIPTION = "Development files for the Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dcore-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c7f125c7ef3a9f4b74dd896abf9e1a4689da912d144efc55e704054289b4f131d6a381abec101739a8de96c5f3e2bde2af3ca7a9889ad859d628bc8e9f18bdeb"

RPROVIDES:${PN} += "cmake-Qt63DCore \
pkgconfig-Qt63DCore \
qt6-3dcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Concurrent \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt63DCore6 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network"

inherit rpm
