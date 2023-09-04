SUMMARY = "Haskell directory library documentation"
DESCRIPTION = "This package provides the Haskell directory library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-doc-1.3.7.1-1.1.noarch.rpm"
RPM_HASH = "87d273d6748c55dc4640bf59ca512e0c395b9a78ce82556f5ebb577cabde59f56f7eb787ae0c89933fcc8a64b2d752a62e8976a04a286a93959c248b5eb50c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-directory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
