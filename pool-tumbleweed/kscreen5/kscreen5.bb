SUMMARY = "Screen management software by KDE"
DESCRIPTION = "KScreen handles screen management for both X11 and Wayland sessions, including rotation, size, refresh rate, and scaling."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kscreen5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "a347c48d97985d1e2e4efd55988b889325067313083c25c14b05e4e584070285688e4e0f658e81517e8a0ae23368dae0f8a5faca2111c86f5bb28a23a447a4f1"

RPROVIDES:${PN} += "application() \
application(kcm_kscreen.desktop) \
kscreen \
kscreen5 \
kscreen5(aarch-64) \
metainfo() \
metainfo(org.kde.kscreen.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh \
kded \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Screen.so.8()(64bit) \
libKF5ScreenDpms.so.8()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libLayerShellQtInterface.so.5()(64bit) \
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
libQt5Sensors.so.5()(64bit) \
libQt5Sensors.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkscreen2-plugin \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxcb.so.1()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kitemmodels.1) \
qt5qmlimport(org.kde.plasma.extras.2) \
xrdb"

inherit rpm
