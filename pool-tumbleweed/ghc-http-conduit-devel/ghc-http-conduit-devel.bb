SUMMARY = "Haskell http-conduit library development files"
DESCRIPTION = "This package provides the Haskell http-conduit library development files."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-devel-2.3.8.2-2.5.aarch64.rpm"
RPM_HASH = "da1b9794f4d2cb77126d0e7d450feccbad5c96f08dfa9aaa6837e8bc3a311c1b93b5b45d3a08321368dd8f7a280db74c22777c0d0017b127866ac2a9a5e3a906"

RPROVIDES:${PN} += "ghc-devel-http-conduit-2.3.8.2-JL53aegdUXo82DAJNh0Sqj \
ghc-http-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-http-conduit"

inherit rpm
