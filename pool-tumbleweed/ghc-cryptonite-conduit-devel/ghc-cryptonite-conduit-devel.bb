SUMMARY = "Haskell cryptonite-conduit library development files"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-devel-0.2.2-9.7.aarch64.rpm"
RPM_HASH = "2911cdc766d4f196d444f5a1a96c64268f56051d7ea93db86e747529f8d1c2a41dda66e55e3467f18a14f111da63fd777357a0429a6819ad64ffb6715c489107"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-devel \
ghc-devel-cryptonite-conduit-0.2.2-4rYVqGhYqU58GDqiFoVTUX"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite-conduit \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-exceptions-0.10.5 \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-transformers-0.5.6.2"

inherit rpm
