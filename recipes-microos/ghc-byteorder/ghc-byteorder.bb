SUMMARY = "Exposes the native endianness or byte ordering of the system"
DESCRIPTION = "This package is for working with the native byte-ordering of the system."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-1.0.4-4.2.aarch64.rpm"
RPM_HASH = "3fb16bca438352b756f48f60454234a991caa65eee74b64594b424088b3f9bfa29c747ea34817888792d9fdd3a74980580d185bb67042fcfb4fb402555b5e18c"

RPROVIDES:${PN} += "ghc-byteorder ghc-byteorder(aarch-64) libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
