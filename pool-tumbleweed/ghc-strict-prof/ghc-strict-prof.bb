SUMMARY = "Haskell strict profiling library"
DESCRIPTION = "This package provides the Haskell strict profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-prof-0.5-1.3.aarch64.rpm"
RPM_HASH = "d0bc1a9406e97e0228002930b46f30d02d6ff49eeee8ce5064f61e953d7a4fa0d4eef0b7014369175200f7884cb82f5ae4bc1b48dc1018e44f22e53864c4cf4f"

RPROVIDES:${PN} += "ghc-prof-strict-0.5-BMGWBclA5sg312fCUlbuTw \
ghc-strict-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-text-2.0.2 \
ghc-prof-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-prof-transformers-0.5.6.2 \
ghc-strict-devel"

inherit rpm
