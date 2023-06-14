SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-chardev-spice-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "bc0c3f330c00a7a623a29950654b61ad5df17d2e339916111f5948aef7197d0dfebc1dfce7c6c15a2e3150264b397534bad0c24463b9e340d9d3f2c60521c381"

RPROVIDES:${PN} += "qemu-chardev-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
