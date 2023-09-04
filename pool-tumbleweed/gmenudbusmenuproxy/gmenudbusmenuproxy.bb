SUMMARY = "GMenu to DBusMenu Proxy"
DESCRIPTION = "This package provides a proxy translating GMenu (GTK Menu) to DBusMenu (the \
standard), useful for global menu implementations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "gmenudbusmenuproxy-5.27.7-3.1.aarch64.rpm"
RPM_HASH = "4ab5a52dda41351df660e0bf6f1c7a59c46b3db4e35aa74b29be5357df7d9d396e624ef2baaada2f787b2a35007ce08e3dbd6b8988e82d7121712f6fc174197d"

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
