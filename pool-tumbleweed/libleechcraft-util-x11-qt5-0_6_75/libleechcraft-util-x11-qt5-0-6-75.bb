SUMMARY = "X11 utility library for LeechCraft"
DESCRIPTION = "A library providing X11 wrappers for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-x11-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "be0949ce52341792b0e15936c4da473815198c0f7fb6aff3cd14d4f99c1fdca08f6e05826bf57d740cd8291f3627f0d20721bb3a5b1189e4b9beaea4aef19c92"

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
