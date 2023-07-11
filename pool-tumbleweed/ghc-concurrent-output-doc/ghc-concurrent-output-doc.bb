SUMMARY = "Haskell concurrent-output library documentation"
DESCRIPTION = "This package provides the Haskell concurrent-output library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-doc-1.10.18-1.3.noarch.rpm"
RPM_HASH = "031f57006bf0849ef23999d7035af8a9f65b63a7c1d6fecc4a9a2cda18266e4dc8d47cf9ca5a4a70caf77bf958898e6fe0d443177360a80a6630797c5bdb3c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-concurrent-output-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
