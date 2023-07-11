SUMMARY = "Haskell resourcet library documentation"
DESCRIPTION = "This package provides the Haskell resourcet library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-doc-1.2.6-2.6.noarch.rpm"
RPM_HASH = "c05b10474e1353d1d72c70b44c15df2a3a16f170ab4e9fdfcf7c5206e3de04ea4caaea58366805d55f97767a82c68b1b856a1ba050a401892fce4efe4ff29f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resourcet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
