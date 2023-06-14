SUMMARY = "LXQt Notification daemon"
DESCRIPTION = "The LXQt Notification daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-notificationd-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "5fc851a67b5b8a3e6825c77b9744e338f9cb0b8656c2985736fc19811d0bbd98f06022464ffb6c8b993a533c02615e4a552acf5f604793983ad46da58ad5ec6e"

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
