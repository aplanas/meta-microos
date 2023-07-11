SUMMARY = "Haskell template-haskell profiling library"
DESCRIPTION = "This package provides the Haskell template-haskell profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-prof-2.19.0.0-3.2.aarch64.rpm"
RPM_HASH = "ad19a4fa3c99c854bb7e539e4f94ca24475b95a6661f8b7484b22683457ca8a2283452a13494267dedc58d3e331ec77b8fd450d3a2217384d3d41a149e5c207b"

RPROVIDES:${PN} += "ghc-prof-template-haskell-2.19.0.0 \
ghc-template-haskell-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-boot-th-9.4.5 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-pretty-1.1.3.6 \
ghc-template-haskell-devel"

inherit rpm
