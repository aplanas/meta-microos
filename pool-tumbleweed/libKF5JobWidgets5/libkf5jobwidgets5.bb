SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5JobWidgets5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6de952ea6a07dfc001f5462149c08dff5f29fac701c6d1dabb1277c5a73ea0cb5f8589008b6c1a935568798839945d3ec19da0bb41f2592ea65257792ec46a5b"

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
