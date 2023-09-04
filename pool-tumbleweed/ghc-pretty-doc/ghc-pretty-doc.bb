SUMMARY = "Haskell pretty library documentation"
DESCRIPTION = "This package provides the Haskell pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-doc-1.1.3.6-1.1.noarch.rpm"
RPM_HASH = "78b5440387a3808d1417f6c4056abd4425d62288127e8e37283378841843883e4bad4c85639c6e6da504ab7311f0619b74e46142e84fe2c06812b8027ecb6f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
