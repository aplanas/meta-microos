SUMMARY = "Qt 5 Virtual Keyboard"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains a virtual keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "c25ad2ffbd8a38cdffe2e07acc334ba49d93b5001eafa3ca95e5ff94b8b241d4ca0bd0f71edbd1b1a3b9b843b2db4146b7fa590b20cf6a4947f778ce9b9ba7f8"

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
