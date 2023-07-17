SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Notifications5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "628cdc50d1d96cb3418c1ebee24b8ec165b469676fc62a76c1efe6cf2e8adbbce64c0b8e0471ebe9642a91ed5c7b43a80c5e24acdaaab4937470e2596401fe92"

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
