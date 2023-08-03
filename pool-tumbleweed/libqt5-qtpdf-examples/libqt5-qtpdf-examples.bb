SUMMARY = "Qt5 PDF examples"
DESCRIPTION = "Examples for the libqt5-qtpdf module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-examples-5.15.14-2.1.aarch64.rpm"
RPM_HASH = "3a6f051bdf5c1bbecafa1736420a3af5e841a3c252b6b45e68891b2a2a72ba0292940bac28b2cef8c3a5ef5cf9c197b398cb92d11d954c7cac589b78697dd88b"

RPROVIDES:${PN} += "libqt5-qtpdf-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Pdf.so.5 \
libQt5PdfWidgets.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.animation.1 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Pdf.5 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
