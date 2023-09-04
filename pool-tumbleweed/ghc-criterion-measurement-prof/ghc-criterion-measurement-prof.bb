SUMMARY = "Haskell criterion-measurement profiling library"
DESCRIPTION = "This package provides the Haskell criterion-measurement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-prof-0.2.1.0-1.7.aarch64.rpm"
RPM_HASH = "3d24d7eb089ed097c72793c9f0321500e9c879037f9bd3dfb9fdd78cc8e2cf01c6f231eb8cf34e19f06d7ee100af5b4554574df9dcebc5925687499262a8608a"

RPROVIDES:${PN} += "ghc-criterion-measurement-prof \
ghc-prof-criterion-measurement-0.2.1.0-2AOdhJohtCNDtfUJjSL1gP"

RDEPENDS:${PN} += "ghc-criterion-measurement-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
