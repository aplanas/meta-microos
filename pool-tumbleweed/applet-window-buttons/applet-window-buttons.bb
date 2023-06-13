SUMMARY = "Plasma 5 applet to show window buttons in panels"
DESCRIPTION = "This is a Plasma 5 applet that shows the current window appmenu in \
one's panels. This plasmoid is coming from Latte land, but it can also \
support Plasma panels."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.1"

RPM_NAME = "applet-window-buttons-0.11.1-2.3.aarch64.rpm"
RPM_HASH = "0ed9597960712a3424553d925b6149192d36a21294afb150c74ed6dd805aee6641c319e595ac95bf5e022c02d3993359b2260080c737b65a51eb4d96db5b56a5"

RPROVIDES:${PN} += "applet-window-buttons \
applet-window-buttons(aarch-64) \
libappletdecorationplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.windowbuttons.appdata.xml) \
qt5qmlimport(org.kde.appletdecoration.0)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libkdecorations2.so.5()(64bit) \
libkdecorations2private.so.10()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.appletdecoration.0) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.configuration.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
qt5qmlimport(org.kde.taskmanager.0)"

inherit rpm
