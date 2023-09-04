SUMMARY = "Haskell cryptonite-conduit profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-prof-0.2.2-9.7.aarch64.rpm"
RPM_HASH = "3fba11226f7233f194529767a3c2b8e78d7ccb936a23d0426d145915af259062238c183e9e1f5f77bb7404ed97b644ee3647a649f9cf81008e08b449aaf04a9e"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-prof \
ghc-prof-cryptonite-conduit-0.2.2-4rYVqGhYqU58GDqiFoVTUX"

RDEPENDS:${PN} += "ghc-cryptonite-conduit-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-exceptions-0.10.5 \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-transformers-0.5.6.2"

inherit rpm
