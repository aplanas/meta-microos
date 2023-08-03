SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.6.noarch.rpm"
RPM_HASH = "6ecb183b367174688cacb49c4c7643be9ddf5b3d47a66b4460daa11ad115942f9b21f40e68e6b37d00718caaadd2e182a55f8700e04fad61ee85559d485188b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
