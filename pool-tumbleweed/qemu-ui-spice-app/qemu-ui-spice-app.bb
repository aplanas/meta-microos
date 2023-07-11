SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-spice-app-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "61aa840dc78e6515b67dabc0f53d4fe4b881b9d7d6f9b4d65cc59ac48f82d8f596a60372b8e34b8066513f9033ab2d303af6852326b7e6e54c09342f450a09ef"

RPROVIDES:${PN} += "qemu-ui-spice-app"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
qemu-chardev-spice \
qemu-ui-spice-core"

inherit rpm
