SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Notifications5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "abe9a19ffa5443b8ed7010b50187b21c1d0dbbd8121a20e025021757e9b9dcd6b77a46fb98d839cf2f6316c7344d23794e6ca1a6a02dce3e82ff9d595c5ce2fb"

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
