SUMMARY = "Haskell binary-orphans library documentation"
DESCRIPTION = "This package provides the Haskell binary-orphans library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-doc-1.0.4.1-1.3.noarch.rpm"
RPM_HASH = "edce377394f51e5e8ca0dbb4a9ede28e0ad6508e24771cbc20c6c76128e599766280622b7de3b77125c6220ad1513f851ae58f5502518135500554e4b83c1f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-orphans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
