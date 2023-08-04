SUMMARY = "Screen management software by KDE"
DESCRIPTION = "KScreen handles screen management for both X11 and Wayland sessions, including rotation, size, refresh rate, and scaling."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kscreen5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "f31a4252a4cc2e0d2704872e0f534966a5027953f80c92b3dcb1500b59a1f6e6b4a261aee1a039e0b7005208616b9c2c7e73f49bf99f3a805c473e694d277b92"

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
