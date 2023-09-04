SUMMARY = "Haskell ghc-lib-parser library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6.20230808"

RPM_NAME = "ghc-ghc-lib-parser-doc-9.4.6.20230808-1.2.noarch.rpm"
RPM_HASH = "4d43144894d8a82bcf04f9c39c1ae80e87184c3ccf5a9d4423990f33dc4a8a540792550437a824651600a8b5df5a0fc3ae1294ef7ec00b87408ea4c3d1c78bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
