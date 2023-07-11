SUMMARY = "Haskell hashable profiling library"
DESCRIPTION = "This package provides the Haskell hashable profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-prof-1.4.2.0-1.5.aarch64.rpm"
RPM_HASH = "db44921c86cf59761579055687d86833d4f3527bef53b21cf7749809eb7227d236daa2fea2a9e9d025425e2edbd0ebbd22bae7002a6c83b41332f569e81046a7"

RPROVIDES:${PN} += "ghc-hashable-prof \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt"

RDEPENDS:${PN} += "ghc-hashable-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-text-2.0.2"

inherit rpm
