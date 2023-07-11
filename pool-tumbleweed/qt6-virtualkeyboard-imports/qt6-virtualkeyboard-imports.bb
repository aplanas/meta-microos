SUMMARY = "Qt 6 VirtualKeyboard QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 VirtualKeyboard module."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ceb35509029f52b3d7baa7fa0536345ffdbe8a6746c64f3dc41c6d1d763c02dd9c132e137c9468e761334f696b1bb796dc1ad324a0ce41bbd01c5a049859b093"

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
