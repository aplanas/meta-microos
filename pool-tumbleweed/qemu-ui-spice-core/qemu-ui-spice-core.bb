SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-spice-core-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "0296031692a39dc4c8aec449abed8e787ebeec34ad282f75e91c0bdeb8cc5b9c05cb445d1b409419e45e6c374f23ccdbfbddb0b1124052627568e334a3c9231c"

RPROVIDES:${PN} += "qemu-ui-spice-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-audio-spice \
qemu-ui-opengl"

inherit rpm
