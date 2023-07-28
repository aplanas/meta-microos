SUMMARY = "Haskell yesod-persistent library documentation"
DESCRIPTION = "This package provides the Haskell yesod-persistent library documentation."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-doc-1.6.0.8-2.10.noarch.rpm"
RPM_HASH = "cfa31c1b074fced36b7a723ec54d71febea0c2baaca12eb43e096dca00b2b7b04f54fca78069aa6fc59ddf8ec90f67bc39de5e862d0594a498456a9b08949f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
