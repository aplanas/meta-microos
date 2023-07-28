SUMMARY = "Haskell regex-tdfa profiling library"
DESCRIPTION = "This package provides the Haskell regex-tdfa profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-prof-1.3.2.1-2.1.aarch64.rpm"
RPM_HASH = "eba01caed9bedc4f17c0355d3b77742b45e255a66b28f98117bd1d05d1936db1aa62aa54d4a8d8c4bb72003cb8a6b62923b7fd39a54a17b9cf06e4ba205f7724"

RPROVIDES:${PN} += "ghc-prof-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-regex-tdfa-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-prof-text-2.0.2 \
ghc-regex-tdfa-devel"

inherit rpm
