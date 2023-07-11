SUMMARY = "Pure Haskell commonmark parser"
DESCRIPTION = "This library provides the core data types and functions for parsing commonmark \
(<https://spec.commonmark.org>). The parser is fully commonmark-compliant and \
passes the test suite. It is designed to be customizable and easily extensible. \
To customize the output, create an AST, or support a new output format, one \
need only define some new typeclass instances. It is also easy to add new \
syntax elements or modify existing ones. \
 \
Accurate information about source positions is available for all block and \
inline elements. Thus the library can be used to create an accurate syntax \
highlighter or an editor with live preview. \
 \
The parser has been designed for robust performance even in pathological cases \
that tend to cause stack overflows or exponential slowdowns in other parsers, \
with parsing speed that varies linearly with input length. \
 \
Related packages: \
 \
- commonmark-extensions (which defines a number of syntax extensions) - \
commonmark-pandoc (which allows using this parser to create a Pandoc structure) \
- commonmark-cli (a command-line tool for converting and syntax-highlighting \
commonmark documents)."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-0.2.3-1.2.aarch64.rpm"
RPM_HASH = "6f27dea8dfe72d7a21c4058846ad03f8486c009d3bcf340b06cb75a8826943ea0b47855311e68ab3727fe12ca8608a3bcc2d660e7008fd879534fc47621024d2"

RPROVIDES:${PN} += "ghc-commonmark \
libHScommonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO-ghc9.4.5.so \
libHSunicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
