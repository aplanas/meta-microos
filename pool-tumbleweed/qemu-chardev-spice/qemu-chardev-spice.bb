SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-chardev-spice-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "92f866bc1063731fcf072b612006a865897bd8ab5aa05923a8555a97c12516ea699f1bd95385f0c762badc30e78090ec0d8433beacbd26fe47220cd3bfd36512"

RPROVIDES:${PN} += "qemu-chardev-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
