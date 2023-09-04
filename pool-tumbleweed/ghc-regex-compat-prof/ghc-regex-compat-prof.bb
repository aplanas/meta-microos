SUMMARY = "Haskell regex-compat profiling library"
DESCRIPTION = "This package provides the Haskell regex-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-prof-0.95.2.1-4.3.aarch64.rpm"
RPM_HASH = "ac81f9a549bcb7ae2e447c1dbcaacfab181fd328a34f94485432926b359e7ad1761507a223bb66587555e209a3c9ae0b6c590e7d8f567d18009b66436702416f"

RPROVIDES:${PN} += "ghc-prof-regex-compat-0.95.2.1-L593ugdrX2dLr3iiylKH00 \
ghc-regex-compat-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-prof-regex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7 \
ghc-regex-compat-devel"

inherit rpm
