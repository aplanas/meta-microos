SUMMARY = "LXQt Notification daemon"
DESCRIPTION = "The LXQt Notification daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-notificationd-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "98549c4ec3dfff1e7b929a43f8eddc509ef324e1e9d5cc574494e22b9797d3a6655551892d74f700e31882c6c1a8db6977e011d85ce1c2a35bf436069d4e9a41"

RPROVIDES:${PN} += "config-lxqt-notificationd \
lxqt-notificationd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xdg.so.3 \
libc.so.6 \
liblxqt.so.1 \
libstdc++.so.6"

inherit rpm
