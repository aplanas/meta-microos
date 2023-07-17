SUMMARY = "Qt6 Quick3DParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticles-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b89220c43afbc075d2ae1a4d81b7dd27b1d4ded2b8d0b2a1f4386aa897ec50936fef45eb8aaff843ad94c501c71cd4145daa876d3337a19197750c89fee9e19a"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticles \
pkgconfig-Qt6Quick3DParticles \
qt6-quick3dparticles-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DParticles6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
pkgconfig-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
