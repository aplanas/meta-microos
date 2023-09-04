SUMMARY = "A simple applicative parser"
DESCRIPTION = "A simple applicative parser in Parsec style."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-0.1.8-4.3.aarch64.rpm"
RPM_HASH = "f267f947c61524d1db214943b435bb96424699864f24200a6cee8e5f0ebd33455a295b64b3ca970a7efd2ac14eec5c0f46f79da41c21590b44422f9f39b43a12"

RPROVIDES:${PN} += "ghc-appar \
libHSappar-0.1.8-1lWb1vtDAvc6rz1D87iAo-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
