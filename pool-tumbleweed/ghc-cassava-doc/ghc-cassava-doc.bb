SUMMARY = "Haskell cassava library documentation"
DESCRIPTION = "This package provides the Haskell cassava library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-doc-0.5.3.0-4.3.noarch.rpm"
RPM_HASH = "2b749d913adf8466135a83f7101a6145f86cdd31d931a5d1108035b4e5bed4ffe6d9bee438151ff02b8521c1185b64d00ab0ee9e918da2bb2e1d05fcfb46f7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
