SUMMARY = "A set of QtQuick components for image editing"
DESCRIPTION = "KQuickImageEditor is a set of QtQuick components providing basic image editing \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "kquickimageeditor-imports-0.2.0-1.11.aarch64.rpm"
RPM_HASH = "f879781c6b3046bd795046f4a4281df31f9be0a2668cef3d25c0e768c2f5038ae11a9d976862054d9ca708470c096adb98669018ef7abdf889ddf69c4280b765"

RPROVIDES:${PN} += "kquickimageeditor-imports \
libkquickimageeditorplugin.so \
qt5qmlimport-org.kde.kquickimageeditor.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickimageeditor.1"

inherit rpm
