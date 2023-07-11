SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.8-2.6.noarch.rpm"
RPM_HASH = "0e57d234fe61e1521076de4b80bacd4637c912599d2cf70b0628c8f76efdcb06b218a800a37df79c865600b0a8b907e5a50e2ce0b0a3c582247bfc68425e40f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
