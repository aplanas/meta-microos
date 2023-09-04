SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-doc-1.6.2.1-2.17.noarch.rpm"
RPM_HASH = "14ece3de27ee1253f47d540477aeb672693c95d0cc0c1c5b80768f408ab47e0116e627c0cb6db026f51ee7e8312e2afdcc895742e160a6c36371737121e21930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
