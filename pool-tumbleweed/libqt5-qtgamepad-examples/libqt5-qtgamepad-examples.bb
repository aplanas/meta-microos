SUMMARY = "Qt5 gamepad examples"
DESCRIPTION = "Examples for the libqt5-qtgamepad module."
LICENSE = "BSD-3-Clause & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtgamepad-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "bda6d095f8d5f1b3eb296a7374b6925ab9048398f9b4b6a3531559987ee9f02091a2850fecc3cefaa7c55c8f01e990aae40a7d5e1a3accb263623444f4e47128"

RPROVIDES:${PN} += "libqt5-qtgamepad-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gamepad.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGamepad.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
