SUMMARY = "Haskell colour library documentation"
DESCRIPTION = "This package provides the Haskell colour library documentation."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-doc-2.3.6-2.8.noarch.rpm"
RPM_HASH = "b7bea966a53c72379f9821feda0393991074499c2fe41b1eec40de752a1dfff834f2c15d9d5261f8c0c860689142ba95ce9a617b7245fcb9b2a29a1aa69d3b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colour-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
