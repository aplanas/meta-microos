SUMMARY = "Haskell vector-algorithms profiling library"
DESCRIPTION = "This package provides the Haskell vector-algorithms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-prof-0.9.0.1-1.9.aarch64.rpm"
RPM_HASH = "099e7fce10ba3bdab9d71044ea63025b4b495c6be09dc7407ee554811b65dedf55e96d55862b4f396eb8d0cb0be47794263985b72fdf87d0628046da6cb05428"

RPROVIDES:${PN} += "ghc-prof-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-vector-algorithms-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-algorithms-devel"

inherit rpm
