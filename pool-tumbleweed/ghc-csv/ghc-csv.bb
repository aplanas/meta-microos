SUMMARY = "CSV loader and dumper"
DESCRIPTION = "CSV loader and dumper \
 \
This library parses and dumps documents that are formatted according to RFC \
4180, 'The common Format and MIME Type for Comma-Separated Values (CSV) Files'. \
This format is used, among many other things, as a lingua franca for \
spreadsheets, and for certain web services."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-0.1.2-4.2.aarch64.rpm"
RPM_HASH = "5f17193b2af134885b5074850860f3d27a16a6b1c7e8ca56e6a3a48c0e56f7592fcded8b3eb5e1ac2c92c8cc74a6f30157424c47288b2227a9080b0a133c5ac6"

RPROVIDES:${PN} += "ghc-csv \
libHScsv-0.1.2-LKioaw43aTAAAKpIk04xxN-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
