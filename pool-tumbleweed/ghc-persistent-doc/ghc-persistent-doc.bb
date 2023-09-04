SUMMARY = "Haskell persistent library documentation"
DESCRIPTION = "This package provides the Haskell persistent library documentation."
LICENSE = "MIT"

PV = "2.14.5.1"

RPM_NAME = "ghc-persistent-doc-2.14.5.1-1.8.noarch.rpm"
RPM_HASH = "e30ffe048252baa7ecb92a9ae6e6c80b126a5c1ace4254afbbd32e5ffa16152491b161cb4c1d6b414f10612ca45d6f0fbff4cacf5380f5a94c979a1dbc41ef8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
