SUMMARY = "Haskell deepseq profiling library"
DESCRIPTION = "This package provides the Haskell deepseq profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-prof-1.4.8.0-1.1.aarch64.rpm"
RPM_HASH = "242dc29ec9991041f5d83699a43d83549b2b79b78582f72efeb8ef1d3aa22434deb509138b3a424f0f78bd28c53ff2379f7a8bcf09eaffdc6700ca0e29a19bb4"

RPROVIDES:${PN} += "ghc-deepseq-prof \
ghc-prof-deepseq-1.4.8.0"

RDEPENDS:${PN} += "ghc-deepseq-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
