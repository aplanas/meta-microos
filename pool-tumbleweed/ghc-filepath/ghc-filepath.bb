SUMMARY = "Haskell filepath library"
DESCRIPTION = "This package provides the Haskell filepath library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-1.4.2.2-3.2.aarch64.rpm"
RPM_HASH = "953559fc4bcee15d999d021a790c84b1d39e9d7eb92d7ca2e413ed4aecbc947a3b90e69fb410e89be834e0565a01589b4bbfcfa2c2a4e1d1a6229c78f59ddee0"

RPROVIDES:${PN} += "ghc-filepath \
libHSfilepath-1.4.2.2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
