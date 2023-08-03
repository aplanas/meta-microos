SUMMARY = "Qt6 Quick3DParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dparticles-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "950bc1da1c4b54091dda78b4326e54f7b6b2738a0a482e4d541056853595dcd82af660446ed9b74dc77806102dd042c6f7f32ccbbe5d058b514fe5dc17775ae6"

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
