SUMMARY = "Qt5 PDF module for QML"
DESCRIPTION = "Qt Quick module for the Qt PDF library."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-imports-5.15.14-1.4.aarch64.rpm"
RPM_HASH = "d905db544e28bf84f83d6169b20103c5d928258cb93d6c8b96eb6e02305215be85bf317ec240aec127110280cbf2043f1531996f0e265f98a336c0d906b31e94"

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
