SUMMARY = "Haskell splitmix library documentation"
DESCRIPTION = "This package provides the Haskell splitmix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-doc-0.1.0.4-4.3.noarch.rpm"
RPM_HASH = "8a380725c86fdfe334f8429ab8ed125d5899261232fbd2a485a442863080ba51b91f65817a9a49c9942036bb1e2c077d71ede80ffd45f0050461f6790fa5c150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-splitmix-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
