SUMMARY = "Qt 6 VirtualKeyboard QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 VirtualKeyboard module."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "23bd65f5a085c48286ba3ed03c7eb20bd125754718f7b359555bf487f4a7d994574ae356587d30cbddc7ca5008233ffea18e4094199c3b9bbd1f6262a33b453d"

RPROVIDES:${PN} += "libqtvkbbuiltinstylesplugin.so()(64bit) \
libqtvkbbuiltinstylesplugin.so(Qt_6)(64bit) \
libqtvkbcomponentsplugin.so()(64bit) \
libqtvkbcomponentsplugin.so(Qt_6)(64bit) \
libqtvkbhangulplugin.so()(64bit) \
libqtvkbhangulplugin.so(Qt_6)(64bit) \
libqtvkbhunspellplugin.so()(64bit) \
libqtvkbhunspellplugin.so(Qt_6)(64bit) \
libqtvkblayoutsplugin.so()(64bit) \
libqtvkblayoutsplugin.so(Qt_6)(64bit) \
libqtvkbopenwnnplugin.so()(64bit) \
libqtvkbopenwnnplugin.so(Qt_6)(64bit) \
libqtvkbpinyinplugin.so()(64bit) \
libqtvkbpinyinplugin.so(Qt_6)(64bit) \
libqtvkbplugin.so()(64bit) \
libqtvkbplugin.so(Qt_6)(64bit) \
libqtvkbpluginsplugin.so()(64bit) \
libqtvkbpluginsplugin.so(Qt_6)(64bit) \
libqtvkbsettingsplugin.so()(64bit) \
libqtvkbsettingsplugin.so(Qt_6)(64bit) \
libqtvkbstylesplugin.so()(64bit) \
libqtvkbstylesplugin.so(Qt_6)(64bit) \
libqtvkbtcimeplugin.so()(64bit) \
libqtvkbtcimeplugin.so(Qt_6)(64bit) \
libqtvkbthaiplugin.so()(64bit) \
libqtvkbthaiplugin.so(Qt_6)(64bit) \
qt6-virtualkeyboard-imports \
qt6-virtualkeyboard-imports(aarch-64) \
qt6qmlimport(QtQuick.VirtualKeyboard.1) \
qt6qmlimport(QtQuick.VirtualKeyboard.2) \
qt6qmlimport(QtQuick.VirtualKeyboard.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Components.1) \
qt6qmlimport(QtQuick.VirtualKeyboard.Components.2) \
qt6qmlimport(QtQuick.VirtualKeyboard.Components.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Layouts.1) \
qt6qmlimport(QtQuick.VirtualKeyboard.Layouts.2) \
qt6qmlimport(QtQuick.VirtualKeyboard.Layouts.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Plugins.Hangul.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Plugins.Hunspell.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Plugins.OpenWNN.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Plugins.Pinyin.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Plugins.TCIme.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Plugins.Thai.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Settings.1) \
qt6qmlimport(QtQuick.VirtualKeyboard.Settings.2) \
qt6qmlimport(QtQuick.VirtualKeyboard.Settings.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Styles.1) \
qt6qmlimport(QtQuick.VirtualKeyboard.Styles.2) \
qt6qmlimport(QtQuick.VirtualKeyboard.Styles.6) \
qt6qmlimport(QtQuick.VirtualKeyboard.Styles.Builtin.6)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6HunspellInputMethod.so.6()(64bit) \
libQt6HunspellInputMethod.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6VirtualKeyboard.so.6()(64bit) \
libQt6VirtualKeyboard.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
