SUMMARY = "Haskell regex-tdfa profiling library"
DESCRIPTION = "This package provides the Haskell regex-tdfa profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.2"

RPM_NAME = "ghc-regex-tdfa-prof-1.3.2.2-1.3.aarch64.rpm"
RPM_HASH = "27f8f109eb06a115ef6f6f104a783f0f1a36dda86c4d20b3908c25492949714920c71c30a73b95daf30daa950369b01e07bc035f7f874ad2d31b4a1b477ff4e5"

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
