SUMMARY = "Development files for Ne10, a math/DSP library for ARM NEON"
DESCRIPTION = "The library provides some of the fastest implementations of key \
operations available for the ARM v7-A and v8-A architectures, \
particularly focusing on math, signal processing, image processing, \
and physics functions. \
 \
This package contains the development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "Ne10-devel-1.2.1-3.14.aarch64.rpm"
RPM_HASH = "1a8f5ae83f2d4b1b906ebac5ff65fe00d106666abb3b6999224a763386813d9900aef91294af8fca961185655695f2a0738efb3b17a0cc1bf7d28503c6f9d994"

RPROVIDES:${PN} += "Ne10-devel"

RDEPENDS:${PN} += "libNE10-10 \
libNE10-test10"

inherit rpm
