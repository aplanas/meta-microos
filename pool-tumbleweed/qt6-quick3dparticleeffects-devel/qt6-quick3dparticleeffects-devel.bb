SUMMARY = "Qt6 Quick3DParticleEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticleeffects-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "51b46c45e5ea645a82e54b032fb16f3153ac0a7eb2fe14a400ba4ea9a74a546bde294ad2c30d6f32c07d4b9a8640f5db71d8c43e4b82154aa2ccaa0b8d74b1ca"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticleEffects \
pkgconfig-Qt6Quick3DParticleEffects \
qt6-quick3dparticleeffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DParticles \
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
