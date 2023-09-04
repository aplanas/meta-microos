SUMMARY = "Haskell hjsmin library documentation"
DESCRIPTION = "This package provides the Haskell hjsmin library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-doc-0.2.1-1.7.noarch.rpm"
RPM_HASH = "67e914b644f1994eeb90d5056b63647172a4c12128dfc93d270a1a535df3cd4eb665b255a644724dafa60c77cb5d2930a11a2dfffd85dcc74ded20ce974775cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hjsmin-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
