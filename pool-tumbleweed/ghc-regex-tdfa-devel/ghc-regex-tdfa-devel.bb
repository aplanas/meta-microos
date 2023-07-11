SUMMARY = "Haskell regex-tdfa library development files"
DESCRIPTION = "This package provides the Haskell regex-tdfa library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-devel-1.3.2.1-1.3.aarch64.rpm"
RPM_HASH = "5d34c86336d167686dc3bd5da3dc62f09c63b9072018d9d3d1c61335cc32ad73c77e13076f1cf853610cc9a192505884b93fceabfe8a8035e95ea774745870b9"

RPROVIDES:${PN} += "ghc-devel-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-regex-tdfa-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-devel-text-2.0.2 \
ghc-regex-tdfa"

inherit rpm
