SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwayland-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "21c06259b4496a006819d9ccfe6e07ba764dc2ac39d6f896530d3648da6b452a5b8a66e9169088497a3cb164989a6260577346453729c1877d933f60f73ad96b"

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
