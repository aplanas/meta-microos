SUMMARY = "Qt Development Kit"
DESCRIPTION = "QML API for Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtquick3d-imports-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "f253f1df9c9553699a7491f60873dc49e759de6fd2a674e04bb18893cde24cedf5f4322a1a3e7c72771b8d0b47f0c6938bf76243f21fde961cff3692c7c79ce4"

RPROVIDES:${PN} += "libqquick3dplugin.so \
libqt5-qtquick3d-imports \
libqtquick3deffectplugin.so \
libqtquick3dhelpersplugin.so \
libqtquick3dmaterialplugin.so \
qt5qmlimport-QtQuick3D.1 \
qt5qmlimport-QtQuick3D.Effects.1 \
qt5qmlimport-QtQuick3D.Helpers.1 \
qt5qmlimport-QtQuick3D.Materials.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Quick3D.so.5 \
libQt5Quick3D5 \
libQt5Quick3DAssetImport5 \
libc.so.6 \
libqt5-qtquick3d-tools \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick3D.1 \
qt5qmlimport-QtQuick3D.Effects.1 \
qt5qmlimport-QtQuick3D.Materials.1"

inherit rpm
