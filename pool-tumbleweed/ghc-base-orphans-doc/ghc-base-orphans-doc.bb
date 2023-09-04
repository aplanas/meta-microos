SUMMARY = "Haskell base-orphans library documentation"
DESCRIPTION = "This package provides the Haskell base-orphans library documentation."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-doc-0.8.8.2-1.3.noarch.rpm"
RPM_HASH = "7a003660d67ca3937fbf38222cecbb5ec53c754e624747351b21783a91cc27a83e37a353d0c803800555b3a6d13158ff48cc13f1a1d2fe9f04c8a6de0457781c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-orphans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
