SUMMARY = "Qt6 Quick3DHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpers-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d6eb1d908e51dec4787462b1189c3c019aa9c2127bf82ca63721b4e83e5467bee1f81705c9dc3320590e74df1effe09b34898af7c4a8e1fdc3e001d48eda8b39"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpers \
pkgconfig-Qt6Quick3DHelpers \
qt6-quick3dhelpers-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6Quick3DHelpers6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3d-private-devel"

inherit rpm
