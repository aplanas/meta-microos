SUMMARY = "Haskell lucid library development files"
DESCRIPTION = "This package provides the Haskell lucid library development files."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-devel-2.11.20230408-1.3.aarch64.rpm"
RPM_HASH = "5417f400e95b4e76d718c63ad38bec33e475bdd694a895c8e01bdf507e50687b7b3f2406ba36c7a356c7fe4ef3690ef1c7b5db3275d2461d7af9f429251096c4"

RPROVIDES:${PN} += "ghc-devel-lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w \
ghc-lucid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-lucid"

inherit rpm
