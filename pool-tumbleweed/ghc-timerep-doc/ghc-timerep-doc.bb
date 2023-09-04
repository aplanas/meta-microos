SUMMARY = "Haskell timerep library documentation"
DESCRIPTION = "This package provides the Haskell timerep library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-doc-2.1.0.0-1.11.noarch.rpm"
RPM_HASH = "f0cbba72e23d39ccf32c227a783ed0c09c4058b57dfaf363c7d9e25c89cab7496aa9f9a7424ec356ece047e34aaea994c79919d909afc0a4825e43fe610a7e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timerep-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
