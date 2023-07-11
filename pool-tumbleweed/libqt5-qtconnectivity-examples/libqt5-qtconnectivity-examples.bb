SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtconnectivity module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtconnectivity-examples-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "566df02b441de06a7d47d5da98c94f8ce8e146d098d0e265b4bad3793896d195dce330001fa9c7601a190570772aa7afa4bf19ed41fcc232965739c12b687bc6"

RPROVIDES:${PN} += "libqt5-qtconnectivity-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Bluetooth.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Nfc.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.1 \
qt5qmlimport-QtBluetooth.5 \
qt5qmlimport-QtNfc.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
