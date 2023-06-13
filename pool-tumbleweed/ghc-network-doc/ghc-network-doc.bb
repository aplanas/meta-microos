SUMMARY = "Haskell network library documentation"
DESCRIPTION = "This package provides the Haskell network library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.2.8"

RPM_NAME = "ghc-network-doc-3.1.2.8-1.3.noarch.rpm"
RPM_HASH = "1de663863f74af4a1d5d6ea1c8a1495ea96b1eede288d31cfb3d300456004b5abf7d6ee1dba22e59324d7710c02c5fa10411f8dd4d92ca04c689ee7a38520735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
