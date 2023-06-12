SUMMARY = "Haskell comonad library documentation"
DESCRIPTION = "This package provides the Haskell comonad library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-doc-5.0.8-3.3.noarch.rpm"
RPM_HASH = "266f52ed6240df12bac8d6378a5c88f77dbc7ba933939d9b19a0c7bc246d6365d88612e1abb5313e3979eb1d0033efe3323414514d668410a975dddc740b5860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-comonad-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
