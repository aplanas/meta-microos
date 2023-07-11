SUMMARY = "Haskell code-page library documentation"
DESCRIPTION = "This package provides the Haskell code-page library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-doc-0.2.1-2.5.noarch.rpm"
RPM_HASH = "0825d8eac4e68993bef86f74f3e5b55e3fdbc54bdd792948c0ac0e202b19cba6ef059cbcf92aa2dbfd2ddfab6eb2d59041d095e429705187a6e831886007dc3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-code-page-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
