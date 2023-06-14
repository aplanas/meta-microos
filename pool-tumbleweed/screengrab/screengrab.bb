SUMMARY = "Qt tool for creating screenshots"
DESCRIPTION = "Screenshot taker with the ability to publish them via hosting services."
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "screengrab-2.6.0-1.1.aarch64.rpm"
RPM_HASH = "14afb1358dc701495b11169c401097ff7adb03d1872f5668062de1e61e72917efa7d6b1e217e2eb5f379e3247be095090aed3ae38b3131a327b203ed4d4cf6a8"

RPROVIDES:${PN} += "screengrab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libX11-xcb.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb-xfixes.so.0"

inherit rpm
