SUMMARY = "Haskell tagged library documentation"
DESCRIPTION = "This package provides the Haskell tagged library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.8"

RPM_NAME = "ghc-tagged-doc-0.8.8-1.2.noarch.rpm"
RPM_HASH = "7ae5f9dff5b179be67fdf40c1ca60b58db85991aa68ef63c8b16b6302d611d19879dc78498b74bb50161dd4e7d0d3b0669c9a13f4a1e681e1b6eca0640fb909a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagged-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
