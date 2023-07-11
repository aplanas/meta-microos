SUMMARY = "Haskell ghc-boot-th library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "0aecf8062d6b14aebc088d0276eb7087c8bdc4963c641e3424cf41dfee48464ab72f6e5df2b4100d1413f8770b9a90817db4a015091e2350c38e76641fc290a0"

RPROVIDES:${PN} += "ghc-ghc-boot-th \
libHSghc-boot-th-9.4.5-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
