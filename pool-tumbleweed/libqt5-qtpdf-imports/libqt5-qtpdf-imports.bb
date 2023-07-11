SUMMARY = "Qt5 PDF module for QML"
DESCRIPTION = "Qt Quick module for the Qt PDF library."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-imports-5.15.14-1.3.aarch64.rpm"
RPM_HASH = "90e206ae641d88d87a5bba2f6332891d3c6913c233913588378a68fbbde3bbc9a372be041e92ee8189f912fd500cbb793bc059c84aaf15a043cc007221d811df"

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
