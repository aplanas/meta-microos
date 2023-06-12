SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-spice-app-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "ecb8213b8399181a83cf89a3cd7af72adf74161fae70c8b8725d67ce6376618de65388374c2fe2fc73a885ae40a9a9b2640e4258b927c0c05a72436a8580b29c"

RPROVIDES:${PN} += "qemu-ui-spice-app \
qemu-ui-spice-app(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
qemu-chardev-spice \
qemu-ui-spice-core"

inherit rpm
