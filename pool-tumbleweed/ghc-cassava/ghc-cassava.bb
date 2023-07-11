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

RPM_NAME = "ghc-cassava-0.5.3.0-2.6.aarch64.rpm"
RPM_HASH = "0cd2380114920671d12707b27ed5dfdd0dabb2e56f805e8f88888c8e28bc423741896d070bc01be24e22b10920b654aadc7fd894424913bf82265ac714ed68db"

RPROVIDES:${PN} += "ghc-cassava \
libHScassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSOnly-0.1-ETd5YCT0TwGLbN8rgpgTS8-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
