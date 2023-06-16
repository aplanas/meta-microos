SUMMARY = "Haskell time-compat library development files"
DESCRIPTION = "This package provides the Haskell time-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-devel-1.9.6.1-5.3.aarch64.rpm"
RPM_HASH = "df9e3da7c2cb1c9dade8f09663e0f40b20a3d90bdc7286e0996c500d2fff67aab9b9b833362130c188585b9c497f6d2c0ac4b8e46db6edcbe67c5c47bea2f6e8"

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
