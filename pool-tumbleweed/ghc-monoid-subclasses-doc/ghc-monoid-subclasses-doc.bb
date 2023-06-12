SUMMARY = "Haskell monoid-subclasses library documentation"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-doc-1.2.3-1.4.noarch.rpm"
RPM_HASH = "10ec6582968fcd09fc6c72ede483d11920c3773881dd900de9b9b58ecb87a2093d7944ced90a822a8e39074dd9187ee83c366cf9dfa81d6e18698c04816215ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monoid-subclasses-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
