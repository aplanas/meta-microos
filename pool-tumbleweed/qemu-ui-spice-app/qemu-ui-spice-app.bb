SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-spice-app-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "b800dd46354eafe0c10494dfdb1017564e64def89eae2a273744ebd95e611718841b2f0d705158d3755a3572b67dab297af67228c615dcf96e5505cc791ab056"

RPROVIDES:${PN} += "qemu-ui-spice-app"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
qemu-chardev-spice \
qemu-ui-spice-core"

inherit rpm
