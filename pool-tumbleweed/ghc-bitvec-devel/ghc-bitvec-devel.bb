SUMMARY = "Haskell bitvec library development files"
DESCRIPTION = "This package provides the Haskell bitvec library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.5.0"

RPM_NAME = "ghc-bitvec-devel-1.1.5.0-1.1.aarch64.rpm"
RPM_HASH = "1f0ba7a1823c54bc47165c200203827a5b6f205b3671a7809a783cbe0763f5c2be1f331359414dd4371696cc03cf5d7a858412d9c159611833c6a893219252bb"

RPROVIDES:${PN} += "ghc-bitvec-devel \
ghc-devel-bitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bitvec \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
