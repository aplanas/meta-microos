SUMMARY = "Haskell xml-conduit profiling library"
DESCRIPTION = "This package provides the Haskell xml-conduit profiling library."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-prof-1.9.1.3-1.7.aarch64.rpm"
RPM_HASH = "fd64705244a550eab603b333b369bc47f5e5655693c8812eea4c44df1b6de3386d2cd0f8e9a9e6db4756e4475ddfda05b75170a47984f6a9eea9c6050a6ec861"

RPROVIDES:${PN} += "ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-xml-conduit-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
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
