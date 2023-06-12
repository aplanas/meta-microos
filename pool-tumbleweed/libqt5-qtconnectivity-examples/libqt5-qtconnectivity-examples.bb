SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtconnectivity module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtconnectivity-examples-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "4d530a7b24b954dd9e643a90518e502778dcb1dc7a92ab65858e2719b7d81aee7bcdad68bc7ccb0facc48c80cd2eb09fe9f214d218c3f52eb96a81dff7254c21"

RPROVIDES:${PN} += "libqt5-qtconnectivity-examples \
libqt5-qtconnectivity-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Bluetooth.so.5()(64bit) \
libQt5Bluetooth.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Nfc.so.5()(64bit) \
libQt5Nfc.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(Qt.labs.folderlistmodel.1) \
qt5qmlimport(QtBluetooth.5) \
qt5qmlimport(QtNfc.5) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
