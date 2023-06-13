SUMMARY = "Qt 6 Quick3D library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "940ff169885ee8bacb401087ec3224686e7c32ee5a448db29110be06eaa9f25fe809c9a9e10ea2537f8016216d244a4a1b9edb4ac72056efadfac2c34179de6e"

RPROVIDES:${PN} += "cmake(Qt6Quick3D) \
cmake(Qt6Quick3DTools) \
pkgconfig(Qt6Quick3D) \
qt6-quick3d-devel \
qt6-quick3d-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6Quick3DRuntimeRender) \
libQt6Quick3D6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3DRuntimeRender) \
qt6-quick3d"

inherit rpm
