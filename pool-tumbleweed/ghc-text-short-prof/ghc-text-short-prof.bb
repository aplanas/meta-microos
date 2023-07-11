SUMMARY = "Haskell text-short profiling library"
DESCRIPTION = "This package provides the Haskell text-short profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-prof-0.1.5-3.6.aarch64.rpm"
RPM_HASH = "17e28f511a049a2e4c4aac828cdd4abc7b3d9b587eeee70d778c144d8787f30656c7dc0cca18979ade77bd1b70259246fdac7f76c3095c9aac351a4ddfe7d0c3"

RPROVIDES:${PN} += "ghc-prof-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-text-short-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-text-short-devel"

inherit rpm
