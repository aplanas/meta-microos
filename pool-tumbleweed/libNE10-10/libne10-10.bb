SUMMARY = "A library of common math and DSP functions optimized for ARM NEON"
DESCRIPTION = "Ne10 is a library of common functions that have been \
optimised for ARM-based CPUs equipped with NEON SIMD capabilities. \
 \
The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libNE10-10-1.2.1-3.14.aarch64.rpm"
RPM_HASH = "04ebaec2356327f405ce116fe3181bd48d399326458d303448812e69c6b1f76a54fc2880ef1a46ef4b7b0b477132c9d327459fc0f1fbf4a660fc3a1906a2f584"

RPROVIDES:${PN} += "libNE10-10 \
libNE10.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
