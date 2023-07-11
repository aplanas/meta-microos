SUMMARY = "Parser for JavaScript"
DESCRIPTION = "Parses Javascript into an Abstract Syntax Tree (AST). Initially intended as \
frontend to hjsmin. \
 \
Note: Version 0.5.0 breaks compatibility with prior versions, the AST has been \
reworked to allow round trip processing of JavaScript."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-0.7.1.0-4.6.aarch64.rpm"
RPM_HASH = "5b046c0f12a60390969202e448063757d9b2ab7831272ef66243fda88e93e48c23bb373946c4bfe566eadbc120e4223055dd692b7cca44c38dcb6b34190be350"

RPROVIDES:${PN} += "ghc-language-javascript \
libHSlanguage-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
