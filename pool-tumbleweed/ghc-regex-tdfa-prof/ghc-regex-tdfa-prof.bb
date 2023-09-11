SUMMARY = "Haskell regex-tdfa profiling library"
DESCRIPTION = "This package provides the Haskell regex-tdfa profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.2"

RPM_NAME = "ghc-regex-tdfa-prof-1.3.2.2-2.1.aarch64.rpm"
RPM_HASH = "20d8907b1a90c7e0ba58737d58b328d9a2245d87d97734f95106aa1e40929be587d4f5b61967ce5b6116c72edf9f9f01ddd0b85d6bfc9c4c90512dd4fa1d6aad"

RPROVIDES:${PN} += "ghc-prof-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-regex-tdfa-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-prof-text-2.0.2 \
ghc-regex-tdfa-devel"

inherit rpm
