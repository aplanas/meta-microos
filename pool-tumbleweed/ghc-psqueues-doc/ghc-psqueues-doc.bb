SUMMARY = "Haskell psqueues library documentation"
DESCRIPTION = "This package provides the Haskell psqueues library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-doc-0.2.7.3-2.9.noarch.rpm"
RPM_HASH = "df6cab4041b6e61ceaf1a7c167f04a77702ad614560447a06691102fef7d4cc1a8efbcbd93cc5b3e4ec7740fbc8a81b23fda440a6c9ce2cbb727bfd10b6acea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-psqueues-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
