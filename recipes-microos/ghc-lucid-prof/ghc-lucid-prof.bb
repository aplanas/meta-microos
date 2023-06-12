SUMMARY = "Haskell lucid profiling library"
DESCRIPTION = "This package provides the Haskell lucid profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-prof-2.11.20230408-1.2.aarch64.rpm"
RPM_HASH = "f3ac0ff9ed75af560eb9c04a3135401b2574ec78b2a61602f7e266a597b3880b699dc30fa7bd3193f6cf28d5e7029128c3c5ba58606c560b6d9432a84cd3dc87"

RPROVIDES:${PN} += "ghc-lucid-prof \
ghc-lucid-prof(aarch-64) \
ghc-prof(lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w)"
RDEPENDS:${PN} += "ghc-lucid-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC) \
ghc-prof(mtl-2.2.2) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
