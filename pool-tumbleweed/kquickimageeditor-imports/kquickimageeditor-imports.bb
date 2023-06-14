SUMMARY = "A set of QtQuick components for image editing"
DESCRIPTION = "KQuickImageEditor is a set of QtQuick components providing basic image editing \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "kquickimageeditor-imports-0.2.0-1.10.aarch64.rpm"
RPM_HASH = "b32e605c2ccb4746443bc39115ac9677bb5df0c0477a61cadce45560be6ffdc744a1bc6fd6e146661f134a6d67da5649016eeb3bd0eff7b5d0d6a882254e2215"

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
