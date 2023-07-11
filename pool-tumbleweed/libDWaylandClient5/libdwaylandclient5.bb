SUMMARY = "DWayland Client Library"
DESCRIPTION = "DWayland is a Qt-style API to interact with the wayland-client API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "libDWaylandClient5-5.24.3-1.4.aarch64.rpm"
RPM_HASH = "46cdd15625009cb5d401805a0eba821001051e404cae5ece93750873de3bdc854decf0ab0a6df073e7bf23a65fb568cd48980dc3574f11f006eaafb1afa1f0e3"

RPROVIDES:${PN} += "libDWaylandClient.so.5 \
libDWaylandClient5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
