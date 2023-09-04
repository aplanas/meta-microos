SUMMARY = "Haskell resource-pool library documentation"
DESCRIPTION = "This package provides the Haskell resource-pool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-doc-0.4.0.0-2.9.noarch.rpm"
RPM_HASH = "6ec273a0bc607e657102a3dfda39a651adee36f67291efa39997e04308b01000ed33d2551a5c7629a41031e980815af84270951cdb557a2a5ece90374d8fdb9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resource-pool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
