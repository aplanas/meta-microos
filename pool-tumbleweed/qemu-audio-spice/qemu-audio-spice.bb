SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-spice-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "ea4ecb878332b84fbb5ad16be4d610b37e0ea04b70d2c5f5bca31e8aea1e14cd4adb0ad1f6c163e03e2c1d31f2c050b984bd865b71f2c1b4eb9c84979e96a324"

RPROVIDES:${PN} += "qemu-audio-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
