SUMMARY = "Haskell ipynb library documentation"
DESCRIPTION = "This package provides the Haskell ipynb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-doc-0.2-2.3.noarch.rpm"
RPM_HASH = "54deba44f6c3b261de7a80d7164e3a0d13879ac1f2cb08db7e1a3ec4adf2c479297cbeb687a0ef54df1f3aace936488d4fcb2dc92d5cf98d7422ab93538174ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ipynb-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
