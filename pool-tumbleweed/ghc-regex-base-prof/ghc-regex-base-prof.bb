SUMMARY = "Haskell regex-base profiling library"
DESCRIPTION = "This package provides the Haskell regex-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-prof-0.94.0.2-4.3.aarch64.rpm"
RPM_HASH = "3713e3d5bf0b953771dbc5a1ee9d00eff347ce95d75d9e0184d0cb37a5d4bd83126b1fd460c9ae91f817b3e685eafc56fe23a3e6ceae259e1b13aa39d0e1c944"

RPROVIDES:${PN} += "ghc-prof-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-regex-base-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-regex-base-devel"

inherit rpm
