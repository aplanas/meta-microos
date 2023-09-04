SUMMARY = "Haskell xml-conduit profiling library"
DESCRIPTION = "This package provides the Haskell xml-conduit profiling library."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-prof-1.9.1.3-1.6.aarch64.rpm"
RPM_HASH = "9f28e152dcecfde9146ebfbcf6f0fd422427e0e9a107ea30218f019cbc62e677f00418a0254d95ef4afea40c94f2f7070f26d6c586ebde7c51fdc7500aa27587"

RPROVIDES:${PN} += "ghc-prof-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-xml-conduit-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-prof-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-xml-conduit-devel"

inherit rpm
