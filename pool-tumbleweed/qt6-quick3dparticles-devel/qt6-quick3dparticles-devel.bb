SUMMARY = "Qt6 Quick3DParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticles-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f1f63d00f1fb2386ab91fe75e53e23abc8b03d089e0de97797d03a59c6fb56c4716d533149cd1c625bae90aad337c96b7d86d7075a4c95ee8fe62cb42e327761"

RPROVIDES:${PN} += "cmake(Qt6Quick3DParticles) \
pkgconfig(Qt6Quick3DParticles) \
qt6-quick3dparticles-devel \
qt6-quick3dparticles-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Quick3DAssetImport) \
cmake(Qt6Quick3DRuntimeRender) \
libQt6Quick3DParticles6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick) \
pkgconfig(Qt6Quick3D) \
pkgconfig(Qt6Quick3DAssetImport) \
pkgconfig(Qt6Quick3DRuntimeRender)"

inherit rpm
