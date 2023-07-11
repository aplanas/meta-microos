SUMMARY = "GMenu to DBusMenu Proxy"
DESCRIPTION = "This package provides a proxy translating GMenu (GTK Menu) to DBusMenu (the \
standard), useful for global menu implementations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "gmenudbusmenuproxy-5.27.6-2.1.aarch64.rpm"
RPM_HASH = "5da5160eca6510aaa07a5b653832157170d5d879b9486d547b953d5a735ebd9d5024299e263d0b0d3e82b45a8a03ebe702b5428d62a0cfb85841c913bab02424"

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
