SUMMARY = "Haskell js-chart library development files"
DESCRIPTION = "This package provides the Haskell js-chart library development files."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-devel-2.9.4.1-2.2.aarch64.rpm"
RPM_HASH = "d41a16af1b4f2bd9aa5dbd278a3cd1a91bc09b3d495904517b1c309864bf0be9599830414983ef9be5e945d8e6470a0c19d18e009e492e503fbfafeeb1cf727f"

RPROVIDES:${PN} += "ghc-devel-js-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d \
ghc-js-chart-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-js-chart"

inherit rpm
