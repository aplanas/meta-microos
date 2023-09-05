SUMMARY = "Qt5 PDF module for QML"
DESCRIPTION = "Qt Quick module for the Qt PDF library."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtpdf-imports-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "4b832eef5a1650c00bf5abb05212205699a1dab6c998a3a9a52b5827675c3918d3fa872330b400b48ba6c7010fc2d0a396e073bc2af87926d69d948957640777"

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
