SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-doc-1.6.2.1-2.9.noarch.rpm"
RPM_HASH = "6519aeab86bc628d6a564026299837a6b04b648eb9b0f46b70b09a7f8607ba0a7da37c9c065bd9cb7964f9380c4ea339b61e76bc62bb7eb6fa74713da16503ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
