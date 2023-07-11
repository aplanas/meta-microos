SUMMARY = "QT/KF5 backend for xdg-desktop-portal"
DESCRIPTION = "A Qt/KF5 backend implementation for xdg-desktop-portal"
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.6"

RPM_NAME = "xdg-desktop-portal-kde-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "9bd7ee115c67af1f1e76671b33c0c18511bd58a6591974ad43390cd71172f17eec26c1daa9c2f990af3e7f7a918c39f5b9c79a4cb0cc6b1aa1d89d8acbdc9dd5"

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
