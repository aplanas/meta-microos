SUMMARY = "Qt 6 VirtualKeyboard QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 VirtualKeyboard module."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-imports-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3b1bfa66b7cb430f73fd6988d9d6ba119e1d2b6381f5ffdcec76ff4ac8375faf42aa79ad4259d8257b56e2adc8914695fafe185821e4d6302b35db8e567b1268"

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
