SUMMARY = "Haskell http-conduit profiling library"
DESCRIPTION = "This package provides the Haskell http-conduit profiling library."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-prof-2.3.8.2-2.5.aarch64.rpm"
RPM_HASH = "62e4d6130faa1fa51636647f83679c7be9ee9fdc6fef06e467a4ce2b04b44a9a982cb0cc5f37103620fb57068fa5a2b5c9b1fb79379d6b5f3521fff8b82b531d"

RPROVIDES:${PN} += "ghc-http-conduit-prof \
ghc-prof-http-conduit-2.3.8.2-JL53aegdUXo82DAJNh0Sqj"

RDEPENDS:${PN} += "ghc-http-conduit-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-prof-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-prof-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES"

inherit rpm
