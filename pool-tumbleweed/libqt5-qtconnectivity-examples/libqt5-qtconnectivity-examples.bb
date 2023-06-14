SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtconnectivity module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtconnectivity-examples-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "4d530a7b24b954dd9e643a90518e502778dcb1dc7a92ab65858e2719b7d81aee7bcdad68bc7ccb0facc48c80cd2eb09fe9f214d218c3f52eb96a81dff7254c21"

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
