SUMMARY = "Specify refactorings to perform with apply-refact"
DESCRIPTION = "This library provides a datatype which can be interpreted by apply-refact. \
It exists as a seperate library so that applications can specify refactorings \
without depending on GHC."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-0.3.0.2-4.3.aarch64.rpm"
RPM_HASH = "c3607afa3410d8b2e5c4195e1f81d269a2b8065f85f080744a6693ceb483f6ddc32c6e872405fa196818b1aea2c5336e85ee4a82e69bb79578b0c2180405f174"

RPROVIDES:${PN} += "ghc-refact \
libHSrefact-0.3.0.2-BDNu2wr6P751Tb9dT06Yg8-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
