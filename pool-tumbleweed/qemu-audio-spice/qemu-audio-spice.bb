SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-audio-spice-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "842123d104f4ae99c26e13dcc6ade4055e999029c10ca6288123ebe2f81cdf1325def61be53407dc0cfb6016eb5078426233d75c621be5ad4e7f7399a6050180"

RPROVIDES:${PN} += "qemu-audio-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
