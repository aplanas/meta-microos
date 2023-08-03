SUMMARY = "TCG accelerator for QEMU"
DESCRIPTION = "TCG is the QEMU binary translator, responsible for converting from target to \
host instruction set. \
 \
This package provides the TCG accelerator for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-accel-tcg-x86-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "8a98bc543ad0c5e47ae923b31090bd8a8beccef4534832798860ef49de4ec504f72574681516cd9c41b739143bc6166e6dc9f35f0ca0b0e68f38c1331f8fe802"

RPROVIDES:${PN} += "qemu-accel-tcg-x86"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
