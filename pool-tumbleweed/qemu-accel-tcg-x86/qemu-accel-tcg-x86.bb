SUMMARY = "TCG accelerator for QEMU"
DESCRIPTION = "TCG is the QEMU binary translator, responsible for converting from target to \
host instruction set. \
 \
This package provides the TCG accelerator for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-accel-tcg-x86-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "653e415cf6cc8d86d92e010ea73bb71eddbbaa4b99bde6494d1dc1e54cdf048933ea3653e90619a681e502a46746e6db7392c60b113a03e4fac1566c700f6ceb"

RPROVIDES:${PN} += "qemu-accel-tcg-x86"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
