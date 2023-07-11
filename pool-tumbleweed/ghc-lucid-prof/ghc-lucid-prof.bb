SUMMARY = "Haskell lucid profiling library"
DESCRIPTION = "This package provides the Haskell lucid profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-prof-2.11.20230408-1.3.aarch64.rpm"
RPM_HASH = "fcec84e1650b353ddd127fee902f1b00992e42efc05267a7ce07360cdb825245389ba3bbca6f410b1913b30dc62c29cdc1aafea3901a7e9764e7500b7c32a59c"

RPROVIDES:${PN} += "ghc-lucid-prof \
ghc-prof-lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w"

RDEPENDS:${PN} += "ghc-lucid-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
