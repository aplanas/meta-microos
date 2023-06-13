SUMMARY = "Qt Development Kit"
DESCRIPTION = "QML API for Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtquick3d-imports-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "6094216247a3503e1c3dee85320264f10cdc118885e37c0455f46833323612afe1a13147272fb3558731cf2cf40c0a08d522891eb3abeb33612f27843ee2bb09"

RPROVIDES:${PN} += "libqquick3dplugin.so()(64bit) \
libqt5-qtquick3d-imports \
libqt5-qtquick3d-imports(aarch-64) \
libqtquick3deffectplugin.so()(64bit) \
libqtquick3dhelpersplugin.so()(64bit) \
libqtquick3dmaterialplugin.so()(64bit) \
qt5qmlimport(QtQuick3D.1) \
qt5qmlimport(QtQuick3D.Effects.1) \
qt5qmlimport(QtQuick3D.Helpers.1) \
qt5qmlimport(QtQuick3D.Materials.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick3D.so.5()(64bit) \
libQt5Quick3D.so.5(Qt_5)(64bit) \
libQt5Quick3D.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick3D5 \
libQt5Quick3DAssetImport5 \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5-qtquick3d-tools \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick3D.1) \
qt5qmlimport(QtQuick3D.Effects.1) \
qt5qmlimport(QtQuick3D.Materials.1)"

inherit rpm
