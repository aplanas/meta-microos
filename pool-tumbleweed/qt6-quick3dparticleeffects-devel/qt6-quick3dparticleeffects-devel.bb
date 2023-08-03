SUMMARY = "Qt6 Quick3DParticleEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dparticleeffects-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "39e91ecdf059f87f9ee40bb8a3cb31c3b10b47f9f9dd33ff63ac3d14e0babf53f67369203520893ecbc5353d90066c78f1b0115f0d658c1a224fdfe49adb3490"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticleEffects \
pkgconfig-Qt6Quick3DParticleEffects \
qt6-quick3dparticleeffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DParticleEffects6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
pkgconfig-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DParticles \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
