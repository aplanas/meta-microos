SUMMARY = "Haskell auto-update library development files"
DESCRIPTION = "This package provides the Haskell auto-update library development files."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-devel-0.1.6-6.3.aarch64.rpm"
RPM_HASH = "61b82c4b20a1fa9b3db8784a3cdcbb0685e93f288bb5b352b464c37cfdf0f030980e41a44b91e6f4c724596a2a0a7ea33a9b88d24500ea4fe34cf2dc83e7c800"

RPROVIDES:${PN} += "ghc-auto-update-devel \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ"

RDEPENDS:${PN} += "/bin/sh \
ghc-auto-update \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
