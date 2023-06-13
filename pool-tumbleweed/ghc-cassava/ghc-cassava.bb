SUMMARY = "A CSV parsing and encoding library"
DESCRIPTION = "'cassava' is a library for parsing and encoding [RFC \
4180](https://tools.ietf.org/html/rfc4180) compliant [comma-separated values \
(CSV)](https://en.wikipedia.org/wiki/Comma-separated_values) data, which is a \
textual line-oriented format commonly used for exchanging tabular data. \
 \
'cassava''s API includes support for \
 \
- Index-based record-conversion - Name-based record-conversion - Typeclass \
directed conversion of fields and records - Built-in field-conversion instances \
for standard types - Customizable record-conversion instance derivation via GHC \
generics - Low-level \
[bytestring](https://hackage.haskell.org/package/bytestring) builders (see \
'Data.Csv.Builder') - Incremental decoding and encoding API (see \
'Data.Csv.Incremental') - Streaming API for constant-space decoding (see \
'Data.Csv.Streaming') \
 \
Moreover, this library is designed to be easy to use; for instance, here's a \
very simple example of encoding CSV data: \
 \
>>> Data.Csv.encode [('John',27),('Jane',28)] 'John,27rnJane,28rn' \
 \
Please refer to the documentation in 'Data.Csv' and the included \
[README](#readme) for more usage examples."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-0.5.3.0-2.3.aarch64.rpm"
RPM_HASH = "b220f6bbb35ad6b7f31f8ca189786866c38ba98ec7df278622566ee71c2eae4135ceca899b8bbfe7074848e247250c695a24ced30e0b1516050f3764bad789bd"

RPROVIDES:${PN} += "ghc-cassava \
ghc-cassava(aarch-64) \
libHScassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSOnly-0.1-ETd5YCT0TwGLbN8rgpgTS8-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so()(64bit) \
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
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
