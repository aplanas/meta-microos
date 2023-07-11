SUMMARY = "Haskell regex-tdfa profiling library"
DESCRIPTION = "This package provides the Haskell regex-tdfa profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-prof-1.3.2.1-1.3.aarch64.rpm"
RPM_HASH = "1e34a10c133aff2afe6a320e81bc4d36a7daf643f2356aabd2b631a9c1f917614d65f290fdfddf1a10d7dcbdbe2c43b7090c763c749052e6f046a29644b24c47"

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
