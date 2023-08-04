SUMMARY = "KDE's screen management library"
DESCRIPTION = "Shared library for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libKF5Screen8-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "ce283650e47cf80e79c3b906a821fd248e22696bc4e6d0ecae99f5ae4ca29d1e1fc81d220e57200d379e059cc1ef57426da8d861af444a24ad839bdee36c1542"

RPROVIDES:${PN} += "libKF5Screen.so.8 \
libKF5Screen8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
