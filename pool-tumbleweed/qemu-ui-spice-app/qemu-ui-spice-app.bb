SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ui-spice-app-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "5b1b5d37ccd813280c39ffe1f01f8e367b265f2e98ba9856b3dde41bd3046480c78cfab08782b9ad8cd09ff468d56ca712971ae22d232ebb34ddb1aaf258f05f"

RPROVIDES:${PN} += "qemu-ui-spice-app"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
qemu-chardev-spice \
qemu-ui-spice-core"

inherit rpm
