SUMMARY = "GMenu to DBusMenu Proxy"
DESCRIPTION = "This package provides a proxy translating GMenu (GTK Menu) to DBusMenu (the \
standard), useful for global menu implementations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "gmenudbusmenuproxy-5.27.5-2.4.aarch64.rpm"
RPM_HASH = "8ff26f1e4167c42e56eb411a920d291810078043dd63a87eb23fae92a30d0bbd30153069714822d5898feddee8b464b1aab56028cd1a81a8d378b007e6d47aab"

RPROVIDES:${PN} += "gmenudbusmenuproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
