SUMMARY = "Haskell extra library documentation"
DESCRIPTION = "This package provides the Haskell extra library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-doc-1.7.14-1.1.noarch.rpm"
RPM_HASH = "76049130d9a166e872e119a2e0fc494beb8602b6e929706891d2efea6755d69b86b21280a2c0e2212b466e9a265c263097e1f09057f27c54ec17349df79712f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
