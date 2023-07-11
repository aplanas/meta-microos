SUMMARY = "Haskell unix library documentation"
DESCRIPTION = "This package provides the Haskell unix library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-doc-2.7.3-3.2.noarch.rpm"
RPM_HASH = "af181991179ed35e9f8b9e5016cebb679e8b968e3763a8271d421f6ebe44cfff62f42f1d8dbf6e26659519230508dc74bc517c4982348df22afbdb47ab9cd403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
