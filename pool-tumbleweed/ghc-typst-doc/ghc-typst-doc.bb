SUMMARY = "Haskell typst library documentation"
DESCRIPTION = "This package provides the Haskell typst library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-doc-0.1.0.0-1.10.noarch.rpm"
RPM_HASH = "731968b280336ad7638bd8c43fba3dfb4e5175acd7adfedf0628c9d34c863ed5fef5b8118f3d2a58719b91f3667b4fbccfbba6ee6896a39b2b8120f30355482e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
