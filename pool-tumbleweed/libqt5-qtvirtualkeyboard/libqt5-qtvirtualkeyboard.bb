SUMMARY = "Qt 5 Virtual Keyboard"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains a virtual keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "8c7ea9c7176b5bf70fa3bbd7aa5da3ef72ed5f07ae58547c1409626e6d3890f0bc33915599eb3fb0513692e5236d8e1f73b4a8ca6b60c4e753005d09467ec03f"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard \
libqtquickvirtualkeyboardplugin.so \
libqtquickvirtualkeyboardsettingsplugin.so \
libqtquickvirtualkeyboardstylesplugin.so \
libqtvirtualkeyboardplugin.so \
qt5qmlimport-QtQuick.VirtualKeyboard.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.VirtualKeyboard.Settings.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.Settings.2 \
qt5qmlimport-QtQuick.VirtualKeyboard.Styles.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.Styles.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Svg.so.5 \
libQt5VirtualKeyboard.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
