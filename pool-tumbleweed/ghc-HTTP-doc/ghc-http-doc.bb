SUMMARY = "Haskell HTTP library documentation"
DESCRIPTION = "This package provides the Haskell HTTP library documentation."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-doc-4000.4.1-1.3.noarch.rpm"
RPM_HASH = "c7efc142dddbe05ffa9d890a90fc74644a088cfb96ad4103c95c66bfe6924dafcd0b9426a69c7d07424f1e555fed3eabf390a5a1336a14534defff902a2058de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HTTP-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
