SUMMARY = "Parallel programming library"
DESCRIPTION = "This package provides a library for parallel programming. \
 \
For documentation start from the 'Control.Parallel.Strategies' module below. \
 \
For more tutorial documentation, see the book \
<http://simonmar.github.io/pages/pcph.html Parallel and Concurrent Programming \
in Haskell>. \
 \
To understand the principles behind the library, see \
<http://simonmar.github.io/bib/papers/strategies.pdf Seq no more: Better \
Strategies for Parallel Haskell>."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-3.2.2.0-12.3.aarch64.rpm"
RPM_HASH = "c15928807e17c2a7565607171e50cde11705c6fa6f5fb156fb984d524395e1878f1cf09754b7022432f1b53b17375fab85c9ec0cb6a00baa37dc1257002e5da2"

RPROVIDES:${PN} += "ghc-parallel \
libHSparallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
