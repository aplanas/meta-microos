SUMMARY = "Haskell regex-base library development files"
DESCRIPTION = "This package provides the Haskell regex-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-devel-0.94.0.2-4.3.aarch64.rpm"
RPM_HASH = "7cca50a362d1a29804240927f6b254e8a94baf0504af14677efbed7772225646e5a59dffa9a4eb2b718d3558fca2ffe6b2ce5364fa6d2a01d97ce5016b1fef51"

RPROVIDES:${PN} += "ghc-devel-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-regex-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-regex-base"

inherit rpm
