SUMMARY = "Parser for JavaScript"
DESCRIPTION = "Parses Javascript into an Abstract Syntax Tree (AST). Initially intended as \
frontend to hjsmin. \
 \
Note: Version 0.5.0 breaks compatibility with prior versions, the AST has been \
reworked to allow round trip processing of JavaScript."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-0.7.1.0-4.3.aarch64.rpm"
RPM_HASH = "0af47191306b47fc8fb12d0232ebec4699d8a267226873d21638b1a1dc9c4ba52cb4dd8659ef4fe5292e75d9efdcd8882f40c5ac9f5b13ed36000318d61e25e0"

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
