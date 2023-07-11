SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-chardev-spice-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "63d6915526560118f7876b0ed4327531694f8edec173cc725adbb842284c1c43085498c716f83c10fda9e2dc9175279588c59b8bcaf1b483e751cf9bcd61b6eb"

RPROVIDES:${PN} += "qemu-chardev-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
