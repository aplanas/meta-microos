SUMMARY = "Haskell http-conduit profiling library"
DESCRIPTION = "This package provides the Haskell http-conduit profiling library."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-prof-2.3.8.2-2.6.aarch64.rpm"
RPM_HASH = "6c20cb84a0936f4bf91f97f115ee2382073e1a034c24a50400fb4f160dc14a589e90ae39557d410d09cc07dfcb72e1ca981f8c835ffa11d1e57f1c2a883d61b8"

RPROVIDES:${PN} += "ghc-http-conduit-prof \
ghc-prof-http-conduit-2.3.8.2-Aom8RblFK6RqEIyPgp71L"

RDEPENDS:${PN} += "ghc-http-conduit-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-prof-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-prof-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES"

inherit rpm
