SUMMARY = "Haskell vault library documentation"
DESCRIPTION = "This package provides the Haskell vault library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-doc-0.3.1.5-4.6.noarch.rpm"
RPM_HASH = "6af6884d9980d33eac38ff6ec526b572ecef0cb53125e3b3b13d62fb51211bf52dada03519142712658697c6c29f82379b8964e4c9914c19ffaf937dd543fe85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vault-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
