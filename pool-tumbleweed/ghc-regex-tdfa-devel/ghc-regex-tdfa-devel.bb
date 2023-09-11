SUMMARY = "Haskell regex-tdfa library development files"
DESCRIPTION = "This package provides the Haskell regex-tdfa library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.2"

RPM_NAME = "ghc-regex-tdfa-devel-1.3.2.2-2.1.aarch64.rpm"
RPM_HASH = "ecfe4cd3536cde064926dc1322e0c4fcc4b2ae4ff3291344fc402842907feaefef5ce08fc9add21dad5fbb14e866f579d39c85cf1cd84ba2c0a51f1725758b68"

RPROVIDES:${PN} += "ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-regex-tdfa-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-devel-text-2.0.2 \
ghc-regex-tdfa"

inherit rpm
