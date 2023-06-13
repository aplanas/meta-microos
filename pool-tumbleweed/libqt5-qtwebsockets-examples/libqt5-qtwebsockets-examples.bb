SUMMARY = "Qt5 websockets examples"
DESCRIPTION = "Examples for the libqt5-qtwebsockets module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde2"

RPM_NAME = "libqt5-qtwebsockets-examples-5.15.9+kde2-1.1.aarch64.rpm"
RPM_HASH = "477e146e49211d06ae3b13e060e8daffaeda6caf148ff7583a842e908d8ea82590acf4855269cfbc0eb83f0e9391e7661a6e8c4a4ba0289acc5b018dfabe1eed"

RPROVIDES:${PN} += "libqt5-qtwebsockets-examples \
libqt5-qtwebsockets-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtWebSockets.1)"

inherit rpm
