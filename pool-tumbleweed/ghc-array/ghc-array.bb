SUMMARY = "Haskell array library"
DESCRIPTION = "This package provides the Haskell array library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-0.5.4.0-3.2.aarch64.rpm"
RPM_HASH = "da6701d8b2203756ded454effaa9f963ac28e786b2c2280e7b6cbd116bd814dbf698b6c9858bec838b6c40c211f2eb02aa8a327d974e6a46e79dc9bd66b220e2"

RPROVIDES:${PN} += "ghc-array \
libHSarray-0.5.4.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
