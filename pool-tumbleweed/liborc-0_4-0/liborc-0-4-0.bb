SUMMARY = "The Oil Runtime Compiler Library"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.34"

RPM_NAME = "liborc-0_4-0-0.4.34-1.1.aarch64.rpm"
RPM_HASH = "e12bbeab6ee95f0b0239d31ee2ffefb56f66e6d6086921b1701c159249a21ff3004ccb5f2e8177d52072d3d6f3924a76119f864dd32dafc74db4f0ef9357bb48"

RPROVIDES:${PN} += "liborc-0-4-0 \
liborc-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
