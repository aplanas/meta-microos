SUMMARY = "KDE's screen management library"
DESCRIPTION = "Energy saving display management library for KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libKF5ScreenDpms8-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "663deb5e51a46fb9d4f7d3893917343348282eb190b042097a7cc963bf5ca8ba7b92d64b7e52dde062c7b13870a5a7ca56340b579cfd197058927618c7d2daff"

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
