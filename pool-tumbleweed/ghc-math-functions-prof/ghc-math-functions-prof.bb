SUMMARY = "Haskell math-functions profiling library"
DESCRIPTION = "This package provides the Haskell math-functions profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-prof-0.3.4.2-2.8.aarch64.rpm"
RPM_HASH = "e09b6a74ee609acced90059da58068f9cd6b0a5f8f33254b9c7fcf17d7df2c42b9d5160230dd6dc92f6f2d9774250286cc007df1fe60d3f820a6a19af96cd5d6"

RPROVIDES:${PN} += "ghc-math-functions-prof \
ghc-prof-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR"

RDEPENDS:${PN} += "ghc-math-functions-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
