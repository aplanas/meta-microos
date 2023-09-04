SUMMARY = "Haskell regex-posix library development files"
DESCRIPTION = "This package provides the Haskell regex-posix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-devel-0.96.0.1-4.3.aarch64.rpm"
RPM_HASH = "97a184a7efc2599711b41fc32b13af55ef20c55eadcec528cee9a222e0d3f00434a7019589dbf34d72136f43130ab897670454d0d1f3d8176e2d5d66ec05da5f"

RPROVIDES:${PN} += "ghc-devel-regex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7 \
ghc-regex-posix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-regex-posix"

inherit rpm
