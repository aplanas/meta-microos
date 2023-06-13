SUMMARY = "Megaparsec parser of CSV files that plays nicely with Cassava"
DESCRIPTION = "Megaparsec parser of CSV files that plays nicely with Cassava."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-2.0.4-3.2.aarch64.rpm"
RPM_HASH = "fc08cfe7bcd5c799e3aba0dba26e4ddb63a234338239cc2f25a1294bef61eaf582dd4736505884a4d2437aa7eb1d7ab8110089e80454707f897b14e3c7c98ba6"

RPROVIDES:${PN} += "ghc-cassava-megaparsec \
ghc-cassava-megaparsec(aarch-64) \
libHScassava-megaparsec-2.0.4-2pnivL0ArW7GGP4dYCJwT3-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSOnly-0.1-ETd5YCT0TwGLbN8rgpgTS8-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so()(64bit) \
libHScassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so()(64bit) \
libHSmegaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
