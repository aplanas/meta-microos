SUMMARY = "Haskell colour library development files"
DESCRIPTION = "This package provides the Haskell colour library development files."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-devel-2.3.6-2.8.aarch64.rpm"
RPM_HASH = "89b6b5b2c195280a5db077acf0d0a85634c27ab13a3df5126eb62b658460a892cbda5ebf0f91e2e932b22b1be1f0143c1a93a9e79d7e9a27f88ad7c0eb58881c"

RPROVIDES:${PN} += "ghc-colour-devel \
ghc-devel-colour-2.3.6-GBcey48GJNAK3398XtiZDq"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-colour \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
