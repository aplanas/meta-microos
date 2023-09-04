SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.0-4.16.noarch.rpm"
RPM_HASH = "abb7784e07c48b007a8dbc070b834e7005a2f7a7243b1cac8dd9cab751e3f4c7421925021006da9ef7f281b9b1e2207440a332b8f800c6ac7e47e233b5fd713a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
