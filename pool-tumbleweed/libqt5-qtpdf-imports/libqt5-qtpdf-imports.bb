SUMMARY = "Qt5 PDF module for QML"
DESCRIPTION = "Qt Quick module for the Qt PDF library."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-imports-5.15.14-2.1.aarch64.rpm"
RPM_HASH = "1b790bcdb040e2ddd33b593d281d79fa15141ab8591951b6ab72e89f31448a6b7dd618ab6dedf7743427d55733af09cadcb5c9a87a620321aaedc73a0d9acc2f"

RPROVIDES:${PN} += "libpdfplugin.so \
libqt5-qtpdf-imports \
qt5qmlimport-QtQuick.Pdf.2 \
qt5qmlimport-QtQuick.Pdf.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Pdf.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.animation.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Pdf.5 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
