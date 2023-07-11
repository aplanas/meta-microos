SUMMARY = "Haskell these profiling library"
DESCRIPTION = "This package provides the Haskell these profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-prof-1.2-1.3.aarch64.rpm"
RPM_HASH = "5bc5a83a5b3c538ff83816c70317ffe4fa4bb55a81f4ecdd431ba37315afc8d9249e99d2de5193feec3faf18f58a1ee76a058de0bbba1bc64b4fd26bef85d840"

RPROVIDES:${PN} += "ghc-prof-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-these-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-foldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-these-devel"

inherit rpm
