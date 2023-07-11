SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kwayland-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "cab1b947a1490ba719a3edb8aadc2d49aa23379851aa0be713189e2b49f461a2df8e1ea763d2e8911612455ad45ebae2b7a39bbd1d0b663fe8a603905118eee0"

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
