SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-doc-3.5-1.16.noarch.rpm"
RPM_HASH = "d24d194d07fdf50675b8ddc34845b82ddca6c551a9da381dffde4a0ea490398caa82aa5e11f2001c20e6736eb65508ace1e50afd70731a9df0bb26d641fc765b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
