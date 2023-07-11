SUMMARY = "Haskell ghc-boot library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-doc-9.4.5-3.2.noarch.rpm"
RPM_HASH = "a45eda130a3ef78a2154e5bc08c49e56b65e5b76ebd16fff781175e319f9dbc6bdba16d502c66c39e036f9aeb8de60ed704126d0c9b663fece796f1b24075b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
