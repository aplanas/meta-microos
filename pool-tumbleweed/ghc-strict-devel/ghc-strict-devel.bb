SUMMARY = "Haskell strict library development files"
DESCRIPTION = "This package provides the Haskell strict library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-devel-0.5-1.3.aarch64.rpm"
RPM_HASH = "9caad8301c25f2abdfc0b1c99cbd8ec91c15e79e0702d29aa3c870b32f665371b50a8c81d39ce42abeecfd6a5c24034ceb757f01794cc5bed7a16f7f1b31fe04"

RPROVIDES:${PN} += "ghc-devel-strict-0.5-BMGWBclA5sg312fCUlbuTw \
ghc-strict-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-text-2.0.2 \
ghc-devel-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-devel-transformers-0.5.6.2 \
ghc-strict"

inherit rpm
