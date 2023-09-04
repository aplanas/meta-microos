SUMMARY = "Haskell ghc-boot-th library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-th-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "51f4422b01740f9d3b524c45157c6907c59f3e58a7c60b3a8f1db170408edfdd9a4645bcff3fa2898213df0fd9a2c09a85580b51041e858309769500bb34ff09"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-th-9.4.6 \
ghc-ghc-boot-th-devel \
ghc-ghc-boot-th-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-ghc-boot-th"

inherit rpm
