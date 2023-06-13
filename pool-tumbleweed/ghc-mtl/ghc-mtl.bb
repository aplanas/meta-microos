SUMMARY = "Haskell mtl library"
DESCRIPTION = "This package provides the Haskell mtl library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-2.2.2-3.1.aarch64.rpm"
RPM_HASH = "106c34c61e4f36e4a8f595fbe521897b43f7a8f35baf0a834c7ac88017b201507794ad6eb887c84ffa7c3272b7a08a0da1560e5319a0d32cfeb77d66f0803319"

RPROVIDES:${PN} += "ghc-mtl \
ghc-mtl(aarch-64) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
