SUMMARY = "DWayland Client Library"
DESCRIPTION = "DWayland is a Qt-style API to interact with the wayland-server API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "libDWaylandServer5-5.24.3-1.3.aarch64.rpm"
RPM_HASH = "384a98243a87e74d82a19e20274485d5621a983f27ace33a9cc7baab18fd1ddfc6ee8b88b0e83eb08a02f3c5746e800cac58ec8791d009ff96d13d1bd4e370f4"

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
