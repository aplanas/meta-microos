SUMMARY = "Haskell filepath library"
DESCRIPTION = "This package provides the Haskell filepath library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-1.4.2.2-1.1.aarch64.rpm"
RPM_HASH = "9d452a4709320f553e470cfe5be185cd3826fb767c491b39d267f8a2adef0f1d8ab609e3bc1dc8ee3baa08c782bc34879456e2ba546b722d2a4bf83737825b56"

RPROVIDES:${PN} += "ghc-filepath ghc-filepath(aarch-64) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
