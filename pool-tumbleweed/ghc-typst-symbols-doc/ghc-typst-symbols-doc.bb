SUMMARY = "Haskell typst-symbols library documentation"
DESCRIPTION = "This package provides the Haskell typst-symbols library documentation."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-typst-symbols-doc-0.1.4-1.1.noarch.rpm"
RPM_HASH = "9b59bb1785c813748887bec662cffabd71a78b35c6bb3d476610eef72c5342894253bf11250829f42b2e0c223e444fce08db903b6d7f3c6f3e306975b0042d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
