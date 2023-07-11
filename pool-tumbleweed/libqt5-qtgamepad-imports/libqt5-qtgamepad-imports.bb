SUMMARY = "QML imports for the Qt5 Gamepad module"
DESCRIPTION = "This package contains QML import files for the Qt5 Gamepad module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtgamepad-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "3e50cb1e91b9894366efb186a8988cec4464008a184db3522afab3951824d83d421ad6c6e4d0d9c4e40185a729ab72f079fcd56a522fc7ebf49cd4451838ebd4"

RPROVIDES:${PN} += "libdeclarative-gamepad.so \
libqt5-qtgamepad-imports \
qt5qmlimport-QtGamepad.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gamepad.so.5 \
libQt5Gamepad5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
