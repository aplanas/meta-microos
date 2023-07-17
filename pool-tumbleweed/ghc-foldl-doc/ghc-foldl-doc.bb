SUMMARY = "Haskell foldl library documentation"
DESCRIPTION = "This package provides the Haskell foldl library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.15"

RPM_NAME = "ghc-foldl-doc-1.4.15-1.1.noarch.rpm"
RPM_HASH = "e9b65b3849212c86b8c2bd319ed266f6932f7fee99f70cdab4461a0457e67b7838274e2af98135063d1139653b3afc9acb9ccfc7352071a028358ee73d6a65e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-foldl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
