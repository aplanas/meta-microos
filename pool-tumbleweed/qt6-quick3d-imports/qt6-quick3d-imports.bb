SUMMARY = "Qt 6 Quick3D QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3D module"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5cc9f19fa62bd903933f5bd445604fb9e4d38f704cb23a81073c7f92faee9983e8f62338089c9442310b64fb5bc03e350e274257007af075e032e1b5805557b5"

RPROVIDES:${PN} += "libqquick3dplugin.so \
libqtquick3dassetutilsplugin.so \
libqtquick3deffectplugin.so \
libqtquick3dhelpersimplplugin.so \
libqtquick3dhelpersplugin.so \
libqtquick3dparticleeffectsplugin.so \
libqtquick3dparticles3dplugin.so \
qt6-quick3d-imports \
qt6qmlimport-QtQuick3D.2 \
qt6qmlimport-QtQuick3D.6 \
qt6qmlimport-QtQuick3D.AssetUtils.6 \
qt6qmlimport-QtQuick3D.Effects.6 \
qt6qmlimport-QtQuick3D.Helpers.1 \
qt6qmlimport-QtQuick3D.Helpers.6 \
qt6qmlimport-QtQuick3D.Helpers.impl.6 \
qt6qmlimport-QtQuick3D.MaterialEditor.1 \
qt6qmlimport-QtQuick3D.ParticleEffects.6 \
qt6qmlimport-QtQuick3D.Particles3D.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libQt6Quick3DAssetUtils.so.6 \
libQt6Quick3DEffects.so.6 \
libQt6Quick3DHelpers.so.6 \
libQt6Quick3DHelpersImpl.so.6 \
libQt6Quick3DParticleEffects.so.6 \
libQt6Quick3DParticles.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
