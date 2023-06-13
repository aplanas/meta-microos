SUMMARY = "A library of common math and DSP functions optimized for ARM NEON"
DESCRIPTION = "The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the shared library with tests."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libNE10_test10-1.2.1-3.13.aarch64.rpm"
RPM_HASH = "6586bd674740ace858ec5b7d3496da263666444b8533b4a81b8a0d5a46a47d09a6876af26ba82789e28b281706b39ff55c4f29d634ed70c8d4676f35dc8f50d0"

RPROVIDES:${PN} += "libNE10_test.so.10()(64bit) \
libNE10_test10 \
libNE10_test10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
