SUMMARY = "GMenu to DBusMenu Proxy"
DESCRIPTION = "This package provides a proxy translating GMenu (GTK Menu) to DBusMenu (the \
standard), useful for global menu implementations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "gmenudbusmenuproxy-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "450e3cf8e1cc07b931d57f3cd0f6c65352f024c98aebc6777e88aced4da8a4737fdaa92f236ec197a3d5f852e621d656eb4d6bb58ad7bea301811159e7ce49e7"

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
