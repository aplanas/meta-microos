SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Notifications5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2752f1e3c1e70c6f70f23007dd5eb40a630fb615f15e7a5c803e9d694be006bef4715523a40782111f1c94d03ddbcd626926ec6613a76b048053070249b5c051"

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
