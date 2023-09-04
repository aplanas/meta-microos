SUMMARY = "Haskell hpc profiling library"
DESCRIPTION = "This package provides the Haskell hpc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-prof-0.6.1.0-1.1.aarch64.rpm"
RPM_HASH = "769f2440f261650aa301ed469e60c62e404b49c559b20446e1efa4d91ca19a84b3bab2860300ceb44095ced27454cbb5fec5de1530f8c3efb1af861b5254077f"

RPROVIDES:${PN} += "ghc-hpc-prof \
ghc-prof-hpc-0.6.1.0"

RDEPENDS:${PN} += "ghc-hpc-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2"

inherit rpm
