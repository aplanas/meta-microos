SUMMARY = "LXQt core library"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "2dd049c7c5d3b5f67e80c22ed0ee7a55cc90ab3f8486fa04022a97715639ffdf773d9aa9e265fbf5a5611b72e3d1b8090435e5658c5707041c78265f60540284"

RPROVIDES:${PN} += "liblxqt \
liblxqt.so.1 \
liblxqt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
