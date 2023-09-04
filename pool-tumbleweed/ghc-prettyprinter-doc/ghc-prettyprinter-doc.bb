SUMMARY = "Haskell prettyprinter library documentation"
DESCRIPTION = "This package provides the Haskell prettyprinter library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-doc-1.7.1-2.3.noarch.rpm"
RPM_HASH = "efc14d198424f264363d79cc3c27bfa1c344cd390c34ab0b445db79c6de1528c5c06b26c2e4288023a9e6417f3f8ee96c86fb33ad07589271362f7b39f6bb069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-prettyprinter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
