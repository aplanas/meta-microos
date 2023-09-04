SUMMARY = "Haskell regex-posix profiling library"
DESCRIPTION = "This package provides the Haskell regex-posix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-prof-0.96.0.1-4.3.aarch64.rpm"
RPM_HASH = "69250046b490a5c095e61529b7761bb35ded64877d5319e9e189cb8ef3d8776e40d7e941f7f1e8d4d91ac7e0e3a4878a266b9e95fc7b5912b29df1e7c8e76107"

RPROVIDES:${PN} += "ghc-prof-regex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7 \
ghc-regex-posix-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-regex-posix-devel"

inherit rpm
