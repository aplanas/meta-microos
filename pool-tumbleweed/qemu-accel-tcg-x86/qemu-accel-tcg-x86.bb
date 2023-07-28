SUMMARY = "TCG accelerator for QEMU"
DESCRIPTION = "TCG is the QEMU binary translator, responsible for converting from target to \
host instruction set. \
 \
This package provides the TCG accelerator for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-accel-tcg-x86-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "7342e5bd09d79d68dbe03cdb4424bb04fe30d0a5e6654cbbca4990954d5931a8e494cf9ecfe5c5907cfc0d44e7a96a320db223de69dd9a5204d0d62e4dec577d"

RPROVIDES:${PN} += "qemu-accel-tcg-x86"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
