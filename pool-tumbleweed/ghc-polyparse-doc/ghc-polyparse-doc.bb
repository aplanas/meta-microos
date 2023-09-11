SUMMARY = "Haskell polyparse library documentation"
DESCRIPTION = "This package provides the Haskell polyparse library documentation."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-doc-1.13-13.1.noarch.rpm"
RPM_HASH = "3c5e6f8d580eea1f65423307674c1d97375eb3b11f04d9945d2aa5cbf86b1a0e31fddd6f2c598912cfdcd0ff167b18ddb82d2ced521efe9c64a33dfd56ab9a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-polyparse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
