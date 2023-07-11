SUMMARY = "Haskell semialign library documentation"
DESCRIPTION = "This package provides the Haskell semialign library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-semialign-doc-1.3-1.3.noarch.rpm"
RPM_HASH = "834d059b522dc6747866dffd9b63ec0c4001fdd115859c6b3c12f82ff77d1cd5b8f9e4365ee1a7eff1aff2d6580e02cb46b708aee80d0056c084a5aff4c758c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semialign-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
