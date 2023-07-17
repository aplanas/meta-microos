SUMMARY = "Qt6 Quick3DHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpers-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fda7046cbca4b41ad43d5c30fb0d5c10623a46bdb5637f5f3fd813cedb55935419542627da52da52a4f69168b2943341d22bce28d9181c458e2bc301f3cb096d"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpers \
pkgconfig-Qt6Quick3DHelpers \
qt6-quick3dhelpers-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6Quick3DHelpers6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3d-private-devel"

inherit rpm
