SUMMARY = "Haskell uniplate library documentation"
DESCRIPTION = "This package provides the Haskell uniplate library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-doc-1.6.13-4.3.noarch.rpm"
RPM_HASH = "53a914ad43065d8087ebab4992c712493e05a2d41e9a76211491ce82809189386f1fd8393bbdd2d4f7f1a7d30ec90811a92dae49214ba6b84511374dccddeb8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uniplate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
