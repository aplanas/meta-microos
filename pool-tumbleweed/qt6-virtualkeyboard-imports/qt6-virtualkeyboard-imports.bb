SUMMARY = "Qt 6 VirtualKeyboard QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 VirtualKeyboard module."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "23bd65f5a085c48286ba3ed03c7eb20bd125754718f7b359555bf487f4a7d994574ae356587d30cbddc7ca5008233ffea18e4094199c3b9bbd1f6262a33b453d"

RPROVIDES:${PN} += "libqtvkbbuiltinstylesplugin.so \
libqtvkbcomponentsplugin.so \
libqtvkbhangulplugin.so \
libqtvkbhunspellplugin.so \
libqtvkblayoutsplugin.so \
libqtvkbopenwnnplugin.so \
libqtvkbpinyinplugin.so \
libqtvkbplugin.so \
libqtvkbpluginsplugin.so \
libqtvkbsettingsplugin.so \
libqtvkbstylesplugin.so \
libqtvkbtcimeplugin.so \
libqtvkbthaiplugin.so \
qt6-virtualkeyboard-imports \
qt6qmlimport-QtQuick.VirtualKeyboard.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Components.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Components.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Components.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hangul.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hunspell.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.OpenWNN.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Pinyin.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.TCIme.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Thai.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Builtin.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6HunspellInputMethod.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libQt6VirtualKeyboard.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
