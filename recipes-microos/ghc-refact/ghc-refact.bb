SUMMARY = "Specify refactorings to perform with apply-refact"
DESCRIPTION = "This library provides a datatype which can be interpreted by apply-refact. \
It exists as a seperate library so that applications can specify refactorings \
without depending on GHC."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-0.3.0.2-4.2.aarch64.rpm"
RPM_HASH = "89b9b25537b8c88ca22a5e06528a04733af5b6484d5fcf64ed0691de00cb62dffa2cbd3ff74e662733034067f0ede4ea0d653d9af4213fd021fe2ad1c5236aad"

RPROVIDES:${PN} += "ghc-refact ghc-refact(aarch-64) libHSrefact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
