SUMMARY = "Haskell safe-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell safe-exceptions library documentation."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-doc-0.1.7.4-1.1.noarch.rpm"
RPM_HASH = "d2a8d952a2f83a539f9b3432997c3bda86d09faf8bb6014d0def850c3c2183b155809206133115477134700586d9e4e33c4a8d3c51923d4a0ce0e6ccfb17f6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
