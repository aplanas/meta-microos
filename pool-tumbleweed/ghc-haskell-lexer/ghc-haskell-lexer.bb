SUMMARY = "A fully compliant Haskell 98 lexer"
DESCRIPTION = "A fully compliant Haskell 98 lexer."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-1.1.1-2.6.aarch64.rpm"
RPM_HASH = "c980beea5ccfd458c2ba3774154372c5837fa12debc93cf4cc7e6f4cfc367db9085ae79e3ea0579eb16315ed79399262096b4a7738f59833db8d6212291d0794"

RPROVIDES:${PN} += "ghc-haskell-lexer \
libHShaskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
