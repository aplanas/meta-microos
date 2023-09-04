SUMMARY = "Exposes the native endianness or byte ordering of the system"
DESCRIPTION = "This package is for working with the native byte-ordering of the system."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-1.0.4-4.3.aarch64.rpm"
RPM_HASH = "2545fea81c8ae0b859ccaa01f631cb92e9fee9d7c41348a8563316cbb5fc2d306f0198053f8389c1be49d92f149eadd70690d2470d3310f38f75fd10356deaa3"

RPROVIDES:${PN} += "ghc-byteorder \
libHSbyteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
