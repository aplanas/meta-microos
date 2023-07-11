SUMMARY = "KDE's screen management library"
DESCRIPTION = "Energy saving display management library for KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libKF5ScreenDpms8-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "cc1db62e44be7321df8eff78849ba81356fd42efa5253934686dc31bd847ab65298569e23a6c73e2f9134a62df94877be3b48ecbce6cbf5f0820276c178e6e51"

RPROVIDES:${PN} += "libKF5ScreenDpms.so.8 \
libKF5ScreenDpms8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Screen8 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WaylandClient.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-dpms.so.0 \
libxcb.so.1"

inherit rpm
