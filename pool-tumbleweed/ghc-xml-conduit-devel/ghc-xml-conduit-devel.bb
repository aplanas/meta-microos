SUMMARY = "Haskell xml-conduit library development files"
DESCRIPTION = "This package provides the Haskell xml-conduit library development files."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-devel-1.9.1.3-1.7.aarch64.rpm"
RPM_HASH = "b2b9eb6048f2717c0840311839b954ba36d4dd2d6f14af614f262e736d889707a5efdd8eda2be9b1e08efe3c4c4dc2640ddd66e4420da952608303e40a2c3576"

RPROVIDES:${PN} += "ghc-devel-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-xml-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-devel-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-xml-conduit"

inherit rpm
