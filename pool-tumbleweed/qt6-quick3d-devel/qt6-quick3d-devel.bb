SUMMARY = "Qt 6 Quick3D library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ce0cc0616076a10826cb92498ca8a66d303916ffbd86c0d8c38bfd565a44d86a6d9d08c39fccc0e6dc45c4f12fb2c707747226f1e50e80f13fad3386fd560913"

RPROVIDES:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6Quick3DTools \
pkgconfig-Qt6Quick3D \
qt6-quick3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3D6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender \
qt6-quick3d"

inherit rpm
