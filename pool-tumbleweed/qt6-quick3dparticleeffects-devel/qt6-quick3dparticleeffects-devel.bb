SUMMARY = "Qt6 Quick3DParticleEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticleEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticleeffects-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f418506234114e4dabb6fa6772513d6c688f6f68c594ee1767e540bf6abdf36da863cf100f16fbdf90af528e06693446c1124fe2f49163634480c3bc857ce7f9"

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
