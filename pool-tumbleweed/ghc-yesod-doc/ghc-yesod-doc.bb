SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-doc-1.6.2.1-2.7.noarch.rpm"
RPM_HASH = "ea02ba2ae9d8bf9c9ee3ce37f35d8ae8d4bc6c51b24c63f2dc6fe231ac76ce51c307103aff6a467891c9e5eb3bc0caad171b9d0f2013e342312796feef817455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
