SUMMARY = "A library of common math and DSP functions optimized for ARM NEON"
DESCRIPTION = "The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the shared library with tests."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libNE10_test10-1.2.1-3.14.aarch64.rpm"
RPM_HASH = "0ec6139e3f255ff9abba66c1897de3f992fd14a0d0fe5026cd56e1a5a035aafaef31b324b6d762a08368cea6791cb5559472ee72db055c91dcb1e1b84a8b4517"

RPROVIDES:${PN} += "libNE10-test.so.10 \
libNE10-test10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
