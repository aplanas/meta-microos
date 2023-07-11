SUMMARY = "Qt 6 Quick3D library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9bf4e46580b5a4bc93c517e857563df5c7f3bf339a84b64ac4f8c2dda6285b679a117ff683ab0432ad657e5ce73f7680c67a0b6c6ca8ce0d59f4ab85a3118f67"

RPROVIDES:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6Quick3DTools \
pkgconfig-Qt6Quick3D \
qt6-quick3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3D6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3d"

inherit rpm
