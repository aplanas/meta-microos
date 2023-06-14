SUMMARY = "Haskell ghc-boot-th library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-devel-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "61eefc936ea0a5189f113f75a1da402dd7fb1e7897212cef20593ca21a0412f0e52ebbb310e95c9bcdae8369639fef850282c1e4e359d14aab1a793fe6a87a51"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-th-9.4.5 \
ghc-ghc-boot-th-devel \
ghc-ghc-boot-th-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-ghc-boot-th"

inherit rpm
