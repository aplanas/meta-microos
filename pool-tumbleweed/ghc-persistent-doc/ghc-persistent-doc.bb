SUMMARY = "Haskell persistent library documentation"
DESCRIPTION = "This package provides the Haskell persistent library documentation."
LICENSE = "MIT"

PV = "2.14.5.1"

RPM_NAME = "ghc-persistent-doc-2.14.5.1-1.9.noarch.rpm"
RPM_HASH = "86d03e0710b92c3d2b61c9a6fb055b523650aaedc6c0a86de949c26a55c3d03974d22e7289852a025ab263cb1984bb1e2acf8c2b56dcc25841abd5604a1ebd1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
