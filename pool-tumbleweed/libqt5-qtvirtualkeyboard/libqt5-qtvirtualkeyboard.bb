SUMMARY = "Qt 5 Virtual Keyboard"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains a virtual keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "c25ad2ffbd8a38cdffe2e07acc334ba49d93b5001eafa3ca95e5ff94b8b241d4ca0bd0f71edbd1b1a3b9b843b2db4146b7fa590b20cf6a4947f778ce9b9ba7f8"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard \
libqt5-qtvirtualkeyboard(aarch-64) \
libqtquickvirtualkeyboardplugin.so()(64bit) \
libqtquickvirtualkeyboardsettingsplugin.so()(64bit) \
libqtquickvirtualkeyboardstylesplugin.so()(64bit) \
libqtvirtualkeyboardplugin.so()(64bit) \
qt5qmlimport(QtQuick.VirtualKeyboard.1) \
qt5qmlimport(QtQuick.VirtualKeyboard.2) \
qt5qmlimport(QtQuick.VirtualKeyboard.Settings.1) \
qt5qmlimport(QtQuick.VirtualKeyboard.Settings.2) \
qt5qmlimport(QtQuick.VirtualKeyboard.Styles.1) \
qt5qmlimport(QtQuick.VirtualKeyboard.Styles.2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5VirtualKeyboard.so.5()(64bit) \
libQt5VirtualKeyboard.so.5(Qt_5)(64bit) \
libQtQuick5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
