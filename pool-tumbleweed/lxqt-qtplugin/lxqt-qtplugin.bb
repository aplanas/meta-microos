SUMMARY = "LXQt platform integration plugin for Qt 5"
DESCRIPTION = "With this plugin, all Qt-based programs can adopt settings of \
LXQt, such as the icon theme. \
 \
To use the plugin in Qt5, we have to export the environment \
variable QT_QPA_PLATFORMTHEME=lxqt. Then every Qt5 program \
can load the theme plugin. \
If, for some unknown reasons, the plugin is not loaded, we can \
debug the plugin by exporting QT_DEBUG_PLUGINS=1. \
Then, Qt5 will print detailed information and error messages \
about all plugins in the console when running any Qt5 programs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-qtplugin-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "2932bec2c175c9e0a41b56723abb594d48f9527def9b711c2b84de9fb1573463279a1dd054e3ca7b8a8d687d57c6a85893eee5d6267631ae84ffbf6133d55b8e"

RPROVIDES:${PN} += "libqtlxqt.so \
lxqt-qtplugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libQt5XdgIconLoader.so.3 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libstdc++.so.6"

inherit rpm
