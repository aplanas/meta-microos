SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.0-4.17.noarch.rpm"
RPM_HASH = "408f587dd32deb3d35977942068ded3b6597bed5e7e138ff007423957497eab313056ad23b42d619fd5531b1963c9bd064908813fd15388004a51810610f714e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
