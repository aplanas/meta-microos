SUMMARY = "QT/KF5 backend for xdg-desktop-portal"
DESCRIPTION = "A Qt/KF5 backend implementation for xdg-desktop-portal"
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "xdg-desktop-portal-kde-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "197e02d93edf6c66e699a82f5c87f24d2387f904e9db0b255100a157d50094703b4bd889f5a0722f727ad227f4422f5fbc3394625715899ca9dfc47e6670a536"

RPROVIDES:${PN} += "xdg-desktop-portal-kde"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
xdg-desktop-portal"

inherit rpm
