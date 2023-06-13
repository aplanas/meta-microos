SUMMARY = "QT/KF5 backend for xdg-desktop-portal"
DESCRIPTION = "A Qt/KF5 backend implementation for xdg-desktop-portal"
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "xdg-desktop-portal-kde-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "197e02d93edf6c66e699a82f5c87f24d2387f904e9db0b255100a157d50094703b4bd889f5a0722f727ad227f4422f5fbc3394625715899ca9dfc47e6670a536"

RPROVIDES:${PN} += "application() \
application(org.freedesktop.impl.portal.desktop.kde.desktop) \
xdg-desktop-portal-kde \
xdg-desktop-portal-kde(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WaylandClient.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
xdg-desktop-portal"

inherit rpm
