SUMMARY = "Development files for the Qt 6 3DCore library"
DESCRIPTION = "Development files for the Qt 6 3DCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dcore-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5a00482c0650b02958950e6ec70455f4a653575696664498ccfc1468b6d8af9891740518cb96980519553cd7db56c1d0d3e33be3e687672a6788a5ea85fd53fa"

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
