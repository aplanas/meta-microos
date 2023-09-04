SUMMARY = "Haskell hpc library documentation"
DESCRIPTION = "This package provides the Haskell hpc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-doc-0.6.1.0-1.1.noarch.rpm"
RPM_HASH = "f06658c706626da350cc9dc29101bec9f2ab0a6fb92efd155b1b817cc94afecaf0008a43354e66b99d2fc21d6458df359725078ca8752823ec68013da7900d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hpc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
