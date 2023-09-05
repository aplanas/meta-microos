SUMMARY = "Qt5 PDF examples"
DESCRIPTION = "Examples for the libqt5-qtpdf module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libqt5-qtpdf-examples-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "4a28aeccecb23f160c03a3c76be58cf96412e0980c163b646525dfdc089b5e0a8db26083b048d5ee87b50f442245e5e0110be123ce6ac9d79ae4acf921d84951"

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
