SUMMARY = "DWayland Client Library"
DESCRIPTION = "DWayland is a Qt-style API to interact with the wayland-server API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "libDWaylandServer5-5.24.3-1.4.aarch64.rpm"
RPM_HASH = "5b754513be7bb39ffd5fbf28af5cf62fd8fc6b656e0636d180acd0b8a7f9d459c7df06bd37fdce2f7f0dcb55b95f2199e674298a6acfc566de3dae1806b7beee"

RPROVIDES:${PN} += "libDWaylandServer.so.5 \
libDWaylandServer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
