SUMMARY = "Haskell bitvec profiling library"
DESCRIPTION = "This package provides the Haskell bitvec profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.5.0"

RPM_NAME = "ghc-bitvec-prof-1.1.5.0-1.1.aarch64.rpm"
RPM_HASH = "23db4753efba9d49e1e3e695b0177c3bf50935e84fcac73b83485803a341310c9e6694e796cbd808d18b2bbca505552a7d3c09f33136e39f0c2ce932856a80cd"

RPROVIDES:${PN} += "ghc-bitvec-prof \
ghc-prof-bitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS"

RDEPENDS:${PN} += "ghc-bitvec-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
