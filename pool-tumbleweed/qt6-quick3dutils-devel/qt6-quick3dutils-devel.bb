SUMMARY = "Qt6 Quick3DUtils library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dutils-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e80988b54a0f5e4a264e8b07ec255c725ba74040b28f8a45ca865d71e8f4970578927d943fad84cdeaa3a74d538ca0398ca3a4e4fdaf983f96a42ace212b607e"

RPROVIDES:${PN} += "cmake-Qt6Quick3DUtils \
pkgconfig-Qt6Quick3DUtils \
qt6-quick3dutils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6Quick3DUtils6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
qt6-quick-private-devel"

inherit rpm
