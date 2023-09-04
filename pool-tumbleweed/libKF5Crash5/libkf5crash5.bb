SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Crash5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "e2c20fe46c41ee5faaffb774cddec79b4c1f6a0abb6b1e1a119fcf73c03e05c8262846f4abe66d14cb94fdb4c899fd420002a28f84e62f0cbcd83eeb33db721f"

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
