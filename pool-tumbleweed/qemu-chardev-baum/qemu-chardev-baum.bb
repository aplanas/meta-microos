SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-chardev-baum-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "22c5346c00f7c15c1f06fc16ed616c5f30b59ad1d78af963386e1614c2b484d1b7225e2692f3d4fc773edcfda37b0883145571dab61e06f84f4a42b00c6d6bc0"

RPROVIDES:${PN} += "qemu-chardev-baum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
