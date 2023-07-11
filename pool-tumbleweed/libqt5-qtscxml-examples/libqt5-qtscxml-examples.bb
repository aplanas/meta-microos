SUMMARY = "Qt5 State Chart XML examples"
DESCRIPTION = "Examples for libqt5-qtscxml module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtscxml-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d27a4c4df2fa74b7f053781b36a35d05ab20572fd410af455965be8635f6d278c21c296adc5fb7ebf90d4e7b85094b0f111e5074eeae6c46673045b6be57a127"

RPROVIDES:${PN} += "libqt5-qtscxml-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Scxml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtScxml.5"

inherit rpm
