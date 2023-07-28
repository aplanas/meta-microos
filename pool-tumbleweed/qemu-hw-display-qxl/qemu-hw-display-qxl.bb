SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-qxl-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "7c89997898ef5b06efd3ba6151dd93b4f48e84ed2e87a7718279255e3b0544ece5f8e814dc520da253c5e06be8b8daeadc3e68cd2c2a5968ce08e4c2521f852e"

RPROVIDES:${PN} += "qemu-hw-display-qxl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
