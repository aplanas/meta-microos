SUMMARY = "libkdepim library"
DESCRIPTION = "The libkdepim library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Libkdepim5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fc63fbdebadf50722b10d8b1b74f74e9192cddaf3729f52e8ebb70574c549056726b2532f3c760b9043d6755713950306e151f667062d61d017c1f0d14fd3316"

RPROVIDES:${PN} += "libKPim5Libkdepim.so.5 \
libKPim5Libkdepim5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkdepim \
libstdc++.so.6"

inherit rpm
