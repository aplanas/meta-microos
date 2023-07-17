SUMMARY = "Development files for the Qt 6 3DAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3danimation-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c14313b2700f5128fb05fe0b8c84969f8831170018b7365ade6102805abe3594ecd312b6abe91ffabcf71cb9f2d2e8aac5d1aaa319e5f3d36c2ecb39ac8a065f"

RPROVIDES:${PN} += "cmake-Qt63DAnimation \
pkgconfig-Qt63DAnimation \
qt6-3danimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DRender \
cmake-Qt6Gui \
libQt63DAnimation6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
