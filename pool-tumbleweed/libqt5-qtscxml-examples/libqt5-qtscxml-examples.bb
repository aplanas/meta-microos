SUMMARY = "Qt5 State Chart XML examples"
DESCRIPTION = "Examples for libqt5-qtscxml module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtscxml-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "fa867915907bc1d2f62a5fd10a365fedb256bb34c5351cb727f37c3796baaff98f13b1c8b5292e51ff711c8000476ddd55fe4590e2bf924ed1c7e997492db5b4"

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
