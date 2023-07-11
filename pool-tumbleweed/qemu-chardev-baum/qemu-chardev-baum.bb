SUMMARY = "Baum braille chardev support for QEMU"
DESCRIPTION = "This package contains a module for baum braille chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-chardev-baum-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "1b0651c08f73b89c5ec0f37d14c97a2f358cba57cf80eba72c937714d119d414475a696b897f400b2cda221b8b46ff121d2899d11954f16f17a832d7315007d3"

RPROVIDES:${PN} += "qemu-chardev-baum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
