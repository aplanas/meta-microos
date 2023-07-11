SUMMARY = "Jitter entropy generator shared library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "libjitterentropy3-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "814edc4a5195d46a3480150c23fdc9f4314f3872a296da98a1b5ec28784d8ae45acb1aaac3a0aa4cc2cd1fb42757b10e3ddc00c06c9e5741c1638e29ed90f647"

RPROVIDES:${PN} += "libjitterentropy.so.3 \
libjitterentropy3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
