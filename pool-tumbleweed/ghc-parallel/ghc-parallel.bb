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

RPM_NAME = "ghc-parallel-3.2.2.0-12.8.aarch64.rpm"
RPM_HASH = "97bb18fd99aae1593cf6b7eec88a91944ddc3d6079828e73ec528170e5a65cc073a6a8611be0a060cf56089bdc5288562ae22f256d3aba9fbc947f27c9e97049"

RPROVIDES:${PN} += "ghc-parallel \
libHSparallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
