SUMMARY = "Qt 6 Quick3D library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e43343bae49497fbe6ae0df52fca784ef8d220a00dd83931fdca4b7d0f9f7e58ea87aacc96dc39edcb0e4b4ee7847f96d67e729466f93403b8bf039e7ba8a529"

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
