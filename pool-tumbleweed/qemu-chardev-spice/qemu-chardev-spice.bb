SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-chardev-spice-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "46d8a720e8031647c513a5eb7a8a592d125987db911a0f1e38e33db5640a844c4054faded12345173824fbb54b7bdd941304e233a3f1dfc0059f4d98bcbd6235"

RPROVIDES:${PN} += "qemu-chardev-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
