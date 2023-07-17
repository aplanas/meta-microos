SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.0-4.8.noarch.rpm"
RPM_HASH = "ae6c435ce14cdad5ae4ccd31db32bac4053ea4efc8a84c42694908ed7e454a3792cbeababa453a6a95264ed8777bdc7573e958e45118fe3ff85e0bc644c10a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
