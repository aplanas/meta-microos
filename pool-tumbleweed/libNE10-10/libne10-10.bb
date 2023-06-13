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

RPM_NAME = "libNE10-10-1.2.1-3.13.aarch64.rpm"
RPM_HASH = "73557a97395115617b06c6e417b56f930aa719d1de1bd979e895ffd5a2ed4f9572fca2998be2da84b0c0cf858199777427c86cf15d9dadc7f5e0dca70bd7e966"

RPROVIDES:${PN} += "libNE10-10 \
libNE10-10(aarch-64) \
libNE10.so.10()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
