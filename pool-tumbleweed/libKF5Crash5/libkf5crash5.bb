SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Crash5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "790c4edf2b29517a776fb548602ba34e777a8568b8e204ea1c6691b7d1c443e3d3c3979f1a97b32f038b0a6fc8b6dcf5a75840edaa157fe91e3f63bf4b8b2cac"

RPROVIDES:${PN} += "libKF5Crash.so.5 \
libKF5Crash5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
