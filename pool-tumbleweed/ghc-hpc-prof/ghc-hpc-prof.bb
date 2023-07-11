SUMMARY = "Haskell hpc profiling library"
DESCRIPTION = "This package provides the Haskell hpc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-prof-0.6.1.0-3.2.aarch64.rpm"
RPM_HASH = "008ab2019dfaee81bd7e5ef3bb316bf918b1c8cba8f2cd1d629c04c4a290cb1f98ad260de95d171d75212835c2bf2bb032506dc41f31b333a151c59969eae15f"

RPROVIDES:${PN} += "ghc-hpc-prof \
ghc-prof-hpc-0.6.1.0"

RDEPENDS:${PN} += "ghc-hpc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2"

inherit rpm
