SUMMARY = "Qt Development Kit"
DESCRIPTION = "QML API for Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtquick3d-imports-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "6094216247a3503e1c3dee85320264f10cdc118885e37c0455f46833323612afe1a13147272fb3558731cf2cf40c0a08d522891eb3abeb33612f27843ee2bb09"

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
