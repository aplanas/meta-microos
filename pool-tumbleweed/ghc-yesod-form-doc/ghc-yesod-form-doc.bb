SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-doc-1.7.4-1.17.noarch.rpm"
RPM_HASH = "c82150dad3a2203f7c1a6301d6db8e13c74251c58228454b9dfa722c4f7eff2f9493bfada6f377c1ffee5b3bb413e023ec1ef0cf1824b99db1e18048e23c1192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
