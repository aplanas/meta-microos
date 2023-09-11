SUMMARY = "Haskell http-conduit library development files"
DESCRIPTION = "This package provides the Haskell http-conduit library development files."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-devel-2.3.8.2-2.6.aarch64.rpm"
RPM_HASH = "49b17e9682e5d574a406fc50fc672e134b12e784516fcc377e9db2e60a6419df3e974f8a535b9cd4fe6d0749bf3544986b9588388da58a8392954d6d4ecf80fd"

RPROVIDES:${PN} += "ghc-devel-http-conduit-2.3.8.2-Aom8RblFK6RqEIyPgp71L \
ghc-http-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-devel-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-http-conduit"

inherit rpm
