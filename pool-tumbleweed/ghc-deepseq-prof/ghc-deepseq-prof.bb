SUMMARY = "Haskell deepseq profiling library"
DESCRIPTION = "This package provides the Haskell deepseq profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-prof-1.4.8.0-3.2.aarch64.rpm"
RPM_HASH = "528d1c0de8726ffce459c26c6e2a7ab6e0ce960f58d9c0a0f26d539804050589c15921e01b710cc016b318d1a4bd8ff86d9b71ef596e419f8d37a362db30a8c0"

RPROVIDES:${PN} += "ghc-deepseq-prof \
ghc-prof-deepseq-1.4.8.0"

RDEPENDS:${PN} += "ghc-deepseq-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
