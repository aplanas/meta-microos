SUMMARY = "Haskell array library"
DESCRIPTION = "This package provides the Haskell array library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-0.5.4.0-3.1.aarch64.rpm"
RPM_HASH = "9958992c28b0504daab7093ef39a454d8d5f0560eb6fddaa391aeeb3209247e90e6cde4ed858cd40ff701ac848d75db87d855f3b6818ee2e976b45b488ef1bc5"

RPROVIDES:${PN} += "ghc-array ghc-array(aarch-64) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
