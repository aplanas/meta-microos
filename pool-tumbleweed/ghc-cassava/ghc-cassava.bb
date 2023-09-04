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

RPM_NAME = "ghc-cassava-0.5.3.0-4.3.aarch64.rpm"
RPM_HASH = "83c68ad447d424c7717489473c2166121ca822dc99c1c1df8f88d51d8deb4bce3d43e00fb800e9f732c64768610a206df911d540e1067ffa3d99c84fe0491431"

RPROVIDES:${PN} += "ghc-cassava \
libHScassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOnly-0.1-qCrN026ulaL2ZFxnlcrV1-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
