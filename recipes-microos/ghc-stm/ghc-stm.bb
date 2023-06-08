SUMMARY = "Haskell stm library"
DESCRIPTION = "This package provides the Haskell stm library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-2.5.1.0-1.1.aarch64.rpm"
RPM_HASH = "d50bc3d08c0ab8815023456cde39b720d22893821a89b814b41a2ee90b271b1a498e6391416115fc2eeb3e76399706874ff6e2ed710cd58aeb443513922ebeef"

RPROVIDES:${PN} += "ghc-stm ghc-stm(aarch-64) libHSstm-2.5.1.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
