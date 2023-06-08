SUMMARY = "Haskell X11-xft library documentation"
DESCRIPTION = "This package provides the Haskell X11-xft library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-doc-0.3.4-2.2.noarch.rpm"
RPM_HASH = "70518652f27e4987a98ce0b8571a2a91c58079cd2e347cd41299515ee494d0ca82d019ecbeda70f5ff9d7be40115be55f839c6d8dfc9d29f995cd2c216818d6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-xft-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
