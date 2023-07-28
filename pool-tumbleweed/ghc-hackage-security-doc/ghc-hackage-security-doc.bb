SUMMARY = "Haskell hackage-security library documentation"
DESCRIPTION = "This package provides the Haskell hackage-security library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-doc-0.6.2.3-3.1.noarch.rpm"
RPM_HASH = "7f3b5f72a14fc313e9805dfe439c73ea46f00a0d30c164d46fe84732354a67d9b89f486f6db5dcd0df968838167282dedbe43219683e67d49c2d90ee20764c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hackage-security-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
