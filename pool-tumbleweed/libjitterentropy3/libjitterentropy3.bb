SUMMARY = "Jitter entropy generator shared library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "libjitterentropy3-3.4.1-2.1.aarch64.rpm"
RPM_HASH = "d88a458ae4048b1c34b0c6b7a64edb889ba18002dc00f82fea02889a688c71cd9d4da21fae9a71f8c1fbcf5d383d32485f155039ba27179d501e1f2dde8ff6de"

RPROVIDES:${PN} += "libjitterentropy.so.3 \
libjitterentropy3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
