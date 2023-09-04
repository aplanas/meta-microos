SUMMARY = "Haskell dense-linear-algebra profiling library"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-prof-0.1.0.0-3.9.aarch64.rpm"
RPM_HASH = "05c54434d21a1a7b2a7331efa8ca2a0f8a31d0e4e1ea9aa850f5b23c6846ca0e436aec2933246b515592da37ed8ddfc305e6209d13f8396d44107eba2dcd3e4a"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-prof \
ghc-prof-dense-linear-algebra-0.1.0.0-FqLdJ2617mhFbXxVUig9Jj"

RDEPENDS:${PN} += "ghc-dense-linear-algebra-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-prof-vector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW \
ghc-prof-vector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ"

inherit rpm
