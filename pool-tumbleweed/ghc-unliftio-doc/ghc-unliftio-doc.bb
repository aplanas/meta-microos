SUMMARY = "Haskell unliftio library documentation"
DESCRIPTION = "This package provides the Haskell unliftio library documentation."
LICENSE = "MIT"

PV = "0.2.24.0"

RPM_NAME = "ghc-unliftio-doc-0.2.24.0-1.3.noarch.rpm"
RPM_HASH = "6a4eb11d38fcd68f06f9d89220b1b006483367d269219dcf586702336288dd35249c3254ad46fe61e8d57f7d64752ffd02d033054c7cb4091ff1dea62f7b0900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
