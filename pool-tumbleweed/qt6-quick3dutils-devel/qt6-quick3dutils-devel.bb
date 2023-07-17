SUMMARY = "Qt6 Quick3DUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dutils-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "81d4e7e8e933a5e7ff9c2cf82d5889feaf404c12c4c4502080e1d6aa3087ebf2f95e0aa510989173f49931e9cfcb8a94b7a5c26a5bb8483200583eac1c76e04d"

RPROVIDES:${PN} += "cmake-Qt6Quick3DUtils \
pkgconfig-Qt6Quick3DUtils \
qt6-quick3dutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
libQt6Quick3DUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
