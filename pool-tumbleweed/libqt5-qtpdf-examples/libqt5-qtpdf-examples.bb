SUMMARY = "Qt5 PDF examples"
DESCRIPTION = "Examples for the libqt5-qtpdf module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-examples-5.15.14-1.3.aarch64.rpm"
RPM_HASH = "a0c202ea3cb626021bac10a6ce693cc79ce7c3eece0f4dba8d57096e7ab78aadab5be57dce8a3e33ecfe0ece8032f6fa2758959eb0802564366652b1f796f4c2"

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
