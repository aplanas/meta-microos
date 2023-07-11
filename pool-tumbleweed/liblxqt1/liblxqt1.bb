SUMMARY = "LXQt core library"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt1-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "1d9e426f2a1524d69096e76b42ad2b926448510e024e213fc3af2b33f232b8c58eddc0ed839e349a16dc529f9e67aff442a67f68ef8db6be9265e93af7842d10"

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
