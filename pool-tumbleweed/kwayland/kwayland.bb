SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwayland-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3f29568542649f13cbfbcee8179a3826b84bda6a7af199f15fe2bb31a58311a1b5b979bfc9cefd2b34c5d3f43ffedc285f8e66614f6379ec9fc39eaf5c0d2806"

RPROVIDES:${PN} += "kwayland \
libKF5WaylandClient.so.5 \
libKF5WaylandClient5 \
libKF5WaylandServer.so.5 \
libKF5WaylandServer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5WaylandClient.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
