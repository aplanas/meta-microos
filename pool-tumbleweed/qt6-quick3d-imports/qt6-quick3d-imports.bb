SUMMARY = "Qt 6 Quick3D QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Quick3D module"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7e830d1698c007e19c601d5c58abaff38b3d6f103e153a503768d354d795ac5ac66b3304c63fb5892e5dc0aec7ae92955859f44c8467078a9dd8da858b199102"

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
qt6qmlimport-QtQuick3D.Effects.6 \
qt6qmlimport-QtQuick3D.Helpers.1 \
qt6qmlimport-QtQuick3D.Helpers.6 \
qt6qmlimport-QtQuick3D.Helpers.impl.6 \
qt6qmlimport-QtQuick3D.MaterialEditor.1"

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
