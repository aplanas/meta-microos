SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-spice-app-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "85b463d60b4fb50d7722b844f56a31373330a517047604ab95eac49f03f785b8fa3c0651904516c675930e13984c1d723ef9ae63e0a85afebf9221d5aeb448d5"

RPROVIDES:${PN} += "qemu-ui-spice-app"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
qemu-chardev-spice \
qemu-ui-spice-core"

inherit rpm
