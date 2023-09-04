SUMMARY = "Haskell ilist library documentation"
DESCRIPTION = "This package provides the Haskell ilist library documentation."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-doc-0.4.0.1-2.1.noarch.rpm"
RPM_HASH = "5fa20a7f2af84c62e4aec8d37f07f89039c5f18b1235bf4ecdd28b530e578537be8cb282d361912f87def1742c55f73235c83734c16f4610550cb91ddc7e12a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ilist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
