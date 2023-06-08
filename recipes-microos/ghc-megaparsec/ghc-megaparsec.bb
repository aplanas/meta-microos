SUMMARY = "Monadic parser combinators"
DESCRIPTION = "This is an industrial-strength monadic parser combinator library. \
Megaparsec is a feature-rich package that tries to find a nice balance between \
speed, flexibility, and quality of parse errors."
LICENSE = "BSD-2-Clause"

PV = "9.3.0"

RPM_NAME = "ghc-megaparsec-9.3.0-1.3.aarch64.rpm"
RPM_HASH = "cb0d49188a66f10949946ca63f2c47bb335d47435085e6d966caf6aa0d7e2d8683056d4762d05501b6e81752dd26b115dababb0a6040b5c29cf13db3c1aabcbf"

RPROVIDES:${PN} += "ghc-megaparsec ghc-megaparsec(aarch-64) libHSmegaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSparser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
