SUMMARY = "Haskell typst library documentation"
DESCRIPTION = "This package provides the Haskell typst library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-doc-0.1.0.0-1.5.noarch.rpm"
RPM_HASH = "6398fc6eae7ba09cc8d844b430a078ff3b3aedfdce3a295ae580733c4d368c61d19925c4a1e796c98061b299351fe2865eecefe1edb2cc65ed308e5dbe545bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
