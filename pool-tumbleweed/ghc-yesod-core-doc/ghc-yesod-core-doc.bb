SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.24.3"

RPM_NAME = "ghc-yesod-core-doc-1.6.24.3-1.2.noarch.rpm"
RPM_HASH = "5f2e5800185b788d83eca6a48656fd096b24b4dd6e7bd6c88ca64595a2857d1f862cd9656b34da57d687a7bf06f636fc3b07766125a0c9ceccdf07e157e89dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
