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

PV = "0.2.2"

RPM_NAME = "ghc-commonmark-0.2.2-2.3.aarch64.rpm"
RPM_HASH = "6fe8f0e85bb6252722e1b76b49de04164dbd578814d8092807f649f84e05c8b24a75c9d0118ce565aa3732134ba4f4dcc9a5cc0ccf9520e8fc7678b3eebd81c0"

RPROVIDES:${PN} += "ghc-commonmark \
ghc-commonmark(aarch-64) \
libHScommonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO-ghc9.4.5.so()(64bit) \
libHSunicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm