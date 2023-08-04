SUMMARY = "QT/KF5 backend for xdg-desktop-portal"
DESCRIPTION = "A Qt/KF5 backend implementation for xdg-desktop-portal"
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.7"

RPM_NAME = "xdg-desktop-portal-kde-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "fa70d87e8fb02a9e57921946ad78de4a6e121fc23beeda6a2e5ade18e6f82f2b23930b9806d3133070b6d35d806a00ef85bd94f1a81db34ab175ddcd964c9380"

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
