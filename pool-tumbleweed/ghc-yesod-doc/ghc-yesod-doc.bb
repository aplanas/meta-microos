SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-doc-1.6.2.1-2.11.noarch.rpm"
RPM_HASH = "0703fb7feec603236c8f807621cfd2b063bde2ed86cf64f2f6ab88579141d758e3f85b7f68c861b9aae51c6be105e683fa8315515f908b8db8da567d0336bcc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
