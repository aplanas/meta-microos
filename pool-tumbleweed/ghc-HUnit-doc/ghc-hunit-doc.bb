SUMMARY = "Haskell HUnit library documentation"
DESCRIPTION = "This package provides the Haskell HUnit library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-doc-1.6.2.0-2.6.noarch.rpm"
RPM_HASH = "3c0e6be91a51860e49ea1b132490d4c4432139f77f55ce1b950830e46fec6f4d4bc2e02b41917474f2ee4074c710f1a32eb8522dfd5bdd3d2f1924ed1724ae5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HUnit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
