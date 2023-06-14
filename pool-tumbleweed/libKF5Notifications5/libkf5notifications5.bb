SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Notifications5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1d31b3465cacba6b911fd8a41c4da75dfe8904d8b3351df257d7545ccb7c2eb45c274dac0fb8abf7d091b722f50a9f2ea47d780c49bb65fb53af264159ad453c"

RPROVIDES:${PN} += "libKF5Notifications.so.5 \
libKF5Notifications5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libcanberra.so.0 \
libdbusmenu-qt5.so.2 \
libstdc++.so.6"

inherit rpm
