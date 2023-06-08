SUMMARY = "Haskell tasty-quickcheck library documentation"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library documentation."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-doc-0.10.2-2.2.noarch.rpm"
RPM_HASH = "b405dd67f6c9fb9bd93df4981c8f85c39d73523dd605f9b1642add1c9f66e446e96d6c5d9f93542ca91c8dd88734c305820ec84c150614a42aa429300f548ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-quickcheck-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
