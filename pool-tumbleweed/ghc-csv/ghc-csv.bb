SUMMARY = "CSV loader and dumper"
DESCRIPTION = "CSV loader and dumper \
 \
This library parses and dumps documents that are formatted according to RFC \
4180, 'The common Format and MIME Type for Comma-Separated Values (CSV) Files'. \
This format is used, among many other things, as a lingua franca for \
spreadsheets, and for certain web services."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-0.1.2-4.3.aarch64.rpm"
RPM_HASH = "68f67588a43c350a8ee94758607e2a0e24ad8f1d4bc7133224adfa9607f9ff0ee35a6d637ec5b7d32b56fff3535f3368e71d8ca8bf92befaf95f309525fd06ce"

RPROVIDES:${PN} += "ghc-csv \
libHScsv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
