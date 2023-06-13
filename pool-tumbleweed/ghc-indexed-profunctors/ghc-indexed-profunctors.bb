SUMMARY = "Utilities for indexed profunctors"
DESCRIPTION = "This package contains basic definitions related to indexed profunctors. \
These are primarily intended as internal utilities to support the 'optics' and \
'generic-lens' package families."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-indexed-profunctors-0.1.1-2.2.aarch64.rpm"
RPM_HASH = "33749c892a8d4f2da57b46b0eca3d9afd372701485ae5e7e0450a74f84d2633992dc5db4f2d52159c1d8eed35ef2534f4df7d23c29c7404d7b5965d120140c3c"

RPROVIDES:${PN} += "ghc-indexed-profunctors \
ghc-indexed-profunctors(aarch-64) \
libHSindexed-profunctors-0.1.1-8slbuH4IUUg1HsCF6rf8GV-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
