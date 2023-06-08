SUMMARY = "Haskell crypto-random library documentation"
DESCRIPTION = "This package provides the Haskell crypto-random library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-doc-0.0.9-5.3.noarch.rpm"
RPM_HASH = "4b93cf3a6a20d934003b75c62ee225c4dc17bdedf0ad2e2c4afb1072a7ae87f01cd59e4a84090f9b22c4a4bc0134a6cb2ca5185dd53f95ba48aa8a2cd2181791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-random-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
