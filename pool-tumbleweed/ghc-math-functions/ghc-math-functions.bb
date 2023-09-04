SUMMARY = "Collection of tools for numeric computations"
DESCRIPTION = "This library contain collection of various utilities for numerical computing. \
So far there're special mathematical functions, compensated summation \
algorithm, summation of series, root finding for real functions, polynomial \
summation and Chebyshev polynomials."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-0.3.4.2-2.8.aarch64.rpm"
RPM_HASH = "3bf05abf681e4f773ff44279ed23180aefb1315847705909947e4742e9d06a43abc12257c1a31af209ad017502fc44db62e018a4f9ca856066b3421c4bdba504"

RPROVIDES:${PN} += "ghc-math-functions \
libHSmath-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
