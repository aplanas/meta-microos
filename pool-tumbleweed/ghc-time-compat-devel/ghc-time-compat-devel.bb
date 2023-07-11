SUMMARY = "Haskell time-compat library development files"
DESCRIPTION = "This package provides the Haskell time-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-devel-1.9.6.1-5.6.aarch64.rpm"
RPM_HASH = "e683c9372135d8170a7d51fd90ac122dc85eeacdc67b2e80c92ec8dc8e777a7fe721d35c17ac07aff98c319324c80cd3d3653e58c82bc5d1402005cfabdbc7a4"

RPROVIDES:${PN} += "ghc-devel-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-time-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-time-1.12.2 \
ghc-time-compat"

inherit rpm
