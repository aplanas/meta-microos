SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.8-2.17.noarch.rpm"
RPM_HASH = "846acb8dbe9a9bba5405ab3d260c80e6d59174915f8c98d9c22ae2b156afd697b61f8a2963a36f8bf459d8d43967bd87bab0c4a635132c6fbf680b6d02190f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
