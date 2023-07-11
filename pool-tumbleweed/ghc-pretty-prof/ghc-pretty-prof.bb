SUMMARY = "Haskell pretty profiling library"
DESCRIPTION = "This package provides the Haskell pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-prof-1.1.3.6-3.2.aarch64.rpm"
RPM_HASH = "dbcfe36fa95a965bc23d738d086202e60e1197947298767cd3097f8b7de94edbef5e714271cb6d61b3f32b6573e7d5164bcc6596b4ff9f72f8da4ffb41b78e83"

RPROVIDES:${PN} += "ghc-pretty-prof \
ghc-prof-pretty-1.1.3.6"

RDEPENDS:${PN} += "ghc-pretty-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
