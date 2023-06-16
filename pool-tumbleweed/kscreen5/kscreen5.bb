SUMMARY = "Screen management software by KDE"
DESCRIPTION = "KScreen handles screen management for both X11 and Wayland sessions, including rotation, size, refresh rate, and scaling."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kscreen5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "a347c48d97985d1e2e4efd55988b889325067313083c25c14b05e4e584070285688e4e0f658e81517e8a0ae23368dae0f8a5faca2111c86f5bb28a23a447a4f1"

RPROVIDES:${PN} += "kscreen \
kscreen5"

RDEPENDS:${PN} += "/usr/bin/sh \
kded \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5Plasma.so.5 \
libKF5QuickAddons.so.5 \
libKF5Screen.so.8 \
libKF5ScreenDpms.so.8 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libLayerShellQtInterface.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sensors.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libkscreen2-plugin \
libstdc++.so.6 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.plasma.extras.2 \
xrdb"

inherit rpm
