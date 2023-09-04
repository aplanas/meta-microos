SUMMARY = "Haskell regex-compat library development files"
DESCRIPTION = "This package provides the Haskell regex-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-devel-0.95.2.1-4.3.aarch64.rpm"
RPM_HASH = "68aca6e9d3221ad53bc3b6af8c1405e2a4f541937e5c49d8bfdcf6b30a665da67fc5edb9ed8361518fac30f8be9b8a64fc33cf43b4863d25e702afbb727a8041"

RPROVIDES:${PN} += "ghc-devel-regex-compat-0.95.2.1-L593ugdrX2dLr3iiylKH00 \
ghc-regex-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-devel-regex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7 \
ghc-regex-compat"

inherit rpm
