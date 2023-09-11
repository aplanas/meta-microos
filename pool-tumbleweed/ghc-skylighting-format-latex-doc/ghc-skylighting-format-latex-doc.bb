SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.11.noarch.rpm"
RPM_HASH = "86d3b2ceff67fde6bf0a647420dd8b9fc65d7abd0f1888db7208d709d45c81b2852580353a738e80c69b87e0e4523401174eb6bd81a9afc2160a0d177cad5bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
