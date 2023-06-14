SUMMARY = "Qt5 gamepad examples"
DESCRIPTION = "Examples for the libqt5-qtgamepad module."
LICENSE = "BSD-3-Clause & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgamepad-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "739ecec2313a9c8ab4a04d5dabb900ff3ce4459813419953011a32b0e5a1a5105e955319a38360bb31034505088c6bb1f63988295fda160467d3d71dd9b5495f"

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
