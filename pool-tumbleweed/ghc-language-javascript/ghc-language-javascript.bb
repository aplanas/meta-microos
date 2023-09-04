SUMMARY = "Parser for JavaScript"
DESCRIPTION = "Parses Javascript into an Abstract Syntax Tree (AST). Initially intended as \
frontend to hjsmin. \
 \
Note: Version 0.5.0 breaks compatibility with prior versions, the AST has been \
reworked to allow round trip processing of JavaScript."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-0.7.1.0-4.8.aarch64.rpm"
RPM_HASH = "a5b37f0be2fe54eb0b839818e1877cc4fde04006c2f93d73abbea4b9e58f7b3775625de9c219f649cb9d335e97e78d7761a37f6f652283a1dcb07cca061e3f5c"

RPROVIDES:${PN} += "ghc-language-javascript \
libHSlanguage-javascript-0.7.1.0-LEIqziehkytABOWYmhOylg-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
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
