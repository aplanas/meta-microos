SUMMARY = "A fully compliant Haskell 98 lexer"
DESCRIPTION = "A fully compliant Haskell 98 lexer."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "a450e02f333ada6c4da281b13034a554cb43a34dbd756c2cace8a03881a235ea58dedab565e8fb6f8d2b22cb058cd88f9cffa19271e9282d93cdc6f00bf76e0c"

RPROVIDES:${PN} += "ghc-haskell-lexer \
ghc-haskell-lexer(aarch-64) \
libHShaskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
