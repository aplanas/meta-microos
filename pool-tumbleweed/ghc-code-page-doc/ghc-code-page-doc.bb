SUMMARY = "Haskell code-page library documentation"
DESCRIPTION = "This package provides the Haskell code-page library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-doc-0.2.1-2.7.noarch.rpm"
RPM_HASH = "d0502feef255d1ac2bc86f1556a81d6dd1a01cc4bd0109fb8b82640251c9d3d6ff2a4a23384494f357ee11dff41c545a492090e2b083591d16d49258396526d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-code-page-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
