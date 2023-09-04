SUMMARY = "Pure Haskell commonmark parser"
DESCRIPTION = "This library provides some useful extensions to core commonmark syntax: smart \
quotes, definition lists, tables, footnotes, math, and more."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-commonmark-extensions-0.2.3.5-1.4.aarch64.rpm"
RPM_HASH = "148fb6dd51796e5039ec450c2897c73bb46468d1e774df5799e4df7f6081fa17a5ad83ce360a38e00533ba0dbeae4ca588ce4282effdb4b65aa0f92587941be7"

RPROVIDES:${PN} += "ghc-commonmark-extensions \
libHScommonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScommonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSemojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr-ghc9.4.6.so \
libHSunicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
