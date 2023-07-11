SUMMARY = "The Oil Runtime Compiler"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.34"

RPM_NAME = "orc-0.4.34-1.1.aarch64.rpm"
RPM_HASH = "2d779bf70ee6e92ada4d3cfd6c58c5407857c848df8114230ff4094841df88e4b9a373f0fb503df56752e7f76328bec859659e66b9ee6dc488791be75b60aaaa"

RPROVIDES:${PN} += "orc \
orc-devel \
pkgconfig-orc-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liborc-0.4.so.0"

inherit rpm
