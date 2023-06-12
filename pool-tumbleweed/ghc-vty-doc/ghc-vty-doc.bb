SUMMARY = "Haskell vty library documentation"
DESCRIPTION = "This package provides the Haskell vty library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-doc-5.38-2.4.noarch.rpm"
RPM_HASH = "163594170e26efa1834b2223565e04f395182470747635368a428499ca1ce2b0ac680dd59ffb0b08ba782d56ed061ab49624056feb3ef68c9208579dad965066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
