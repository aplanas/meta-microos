SUMMARY = "Haskell mtl library documentation"
DESCRIPTION = "This package provides the Haskell mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-doc-2.2.2-3.1.noarch.rpm"
RPM_HASH = "121bce86d259c0e18751c2e58f1bc7409048c0c404c83ffe490b277580e7571e17e105d65effbfe4c1172ba1e9fecaad7122ee1029e44cd0b0274d6b5709657d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mtl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
