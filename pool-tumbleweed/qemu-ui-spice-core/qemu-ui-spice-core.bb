SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-spice-core-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "0804e10402ca9e78f51a23c747fa49b51aeab9344365a4a8dc3addd6dd1d587be12f9c5fba6dfdb9a20b8b679e546f5fe70085a35c67ebe2318fd664419f49a8"

RPROVIDES:${PN} += "qemu-ui-spice-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-audio-spice \
qemu-ui-opengl"

inherit rpm
