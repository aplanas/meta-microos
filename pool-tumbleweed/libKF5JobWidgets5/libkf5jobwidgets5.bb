SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5JobWidgets5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "fab4800e73c1491aaa036e23a0e81a50b400677879290c69243b7cc0744b5429d931daafda2babe6e978f4bb20536db60bd92089ff75b30829cd28e037ba64c8"

RPROVIDES:${PN} += "libKF5JobWidgets.so.5 \
libKF5JobWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
