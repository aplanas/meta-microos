SUMMARY = "Haskell css-text library documentation"
DESCRIPTION = "This package provides the Haskell css-text library documentation."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-doc-0.1.3.0-4.9.noarch.rpm"
RPM_HASH = "9f96c41aac52d6264c37d26e2d00748559fb9211f7d395c7692a9c4a86e40d9816d3ee0a6e2e46c07af4dd9829aae778b09eaf96ff59a1f957053ed9e1a09333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-css-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
