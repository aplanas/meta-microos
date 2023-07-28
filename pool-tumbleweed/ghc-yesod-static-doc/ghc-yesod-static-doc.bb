SUMMARY = "Haskell yesod-static library documentation"
DESCRIPTION = "This package provides the Haskell yesod-static library documentation."
LICENSE = "MIT"

PV = "1.6.1.0"

RPM_NAME = "ghc-yesod-static-doc-1.6.1.0-4.10.noarch.rpm"
RPM_HASH = "637481ef2bfe858da688f3545f0812fd6472c4355ce67507e9efed469714d759453fdea171fc91af3f9a853bc01ebcf09b44f3a57751c914781231e2cb94ae48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
