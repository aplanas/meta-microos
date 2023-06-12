SUMMARY = "Development files for Ne10, a math/DSP library for ARM NEON"
DESCRIPTION = "The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "Ne10-devel-1.2.1-3.13.aarch64.rpm"
RPM_HASH = "326f327e7523875afa8f67a0a4999363c3d9157dda88b083ba1c8652912a7a99e79728dced459f60afa20ea7a2c476c255bd0a3bcdbee62e70db6eb4c43958ee"

RPROVIDES:${PN} += "Ne10-devel \
Ne10-devel(aarch-64)"
RDEPENDS:${PN} += "libNE10-10 \
libNE10_test10"

inherit rpm
