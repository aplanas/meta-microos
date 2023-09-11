SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.24.4"

RPM_NAME = "ghc-yesod-core-doc-1.6.24.4-1.7.noarch.rpm"
RPM_HASH = "218b0a6923a7e96879a1e5bdf8d9cbb6403ee9a32e6e4a5a62a274327f14fa7010515d561b650e2e3d086a1df429beb93a7d43c1db82c65b980123d3a2f1150c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
