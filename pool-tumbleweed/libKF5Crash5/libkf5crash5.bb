SUMMARY = "An application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Crash5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "ea2f354f276919e77c8617134a733ac253a8667d856f679dd49dc74563cb1e10b7d26460801741ee0d90f20cbbf72af4566b95464d1547363c85953af92f2e94"

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
