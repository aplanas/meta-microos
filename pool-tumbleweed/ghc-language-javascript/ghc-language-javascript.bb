SUMMARY = "Parser for JavaScript"
DESCRIPTION = "Parses Javascript into an Abstract Syntax Tree (AST). Initially intended as \
frontend to hjsmin. \
 \
Note: Version 0.5.0 breaks compatibility with prior versions, the AST has been \
reworked to allow round trip processing of JavaScript."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-0.7.1.0-4.9.aarch64.rpm"
RPM_HASH = "89be45eebe3352d79211bdb917731d50d6798c97ed72fb51624837de18d2ff32026f5721e9327e928c8319975241c2d6b6857484a8b73a28afa84baa18f95e2e"

RPROVIDES:${PN} += "ghc-language-javascript \
libHSlanguage-javascript-0.7.1.0-5tkeoDchqnObRztPRYxz4-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
