SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-doc-3.5-1.11.noarch.rpm"
RPM_HASH = "f7257e3242227d51518f1a8b5d98a16084ff81c0f613b8fc38d6f8a7063da6c8263fb3e549a1910ba1457f660fe3fd20c3315705ce58421d4dc77586c3aecfd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
