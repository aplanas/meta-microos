SUMMARY = "X11 utility library for LeechCraft"
DESCRIPTION = "A library providing X11 wrappers for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-x11-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "abb7484e3cfc11e4ae20c04c89388cc9dcf47656c8b5a755a07c34cb0f50b542b935fe3c2a5ceea9078a9a3a060d9aa0a586c47043f4df0f2f2df19073c5ad75"

RPROVIDES:${PN} += "libleechcraft-util-x11-qt5-0-6-75 \
libleechcraft-util-x11-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
