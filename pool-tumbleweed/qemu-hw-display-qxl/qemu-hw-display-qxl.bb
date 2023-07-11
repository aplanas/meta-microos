SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-qxl-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "5b504a137d0044f82abe75316b72db093fdb541b1fb4d75692cc00d3e7dd1fa3a43274f72f09ba35c4887f5201b9c8fc23eefbad1e9331ed76f568c0716ce982"

RPROVIDES:${PN} += "qemu-hw-display-qxl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
