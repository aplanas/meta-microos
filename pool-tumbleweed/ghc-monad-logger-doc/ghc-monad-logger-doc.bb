SUMMARY = "Haskell monad-logger library documentation"
DESCRIPTION = "This package provides the Haskell monad-logger library documentation."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-doc-0.3.40-1.2.noarch.rpm"
RPM_HASH = "bbdd4f630bd32927dcc43ddbeccd70c48be6d60da16609e25fee1f30cc7b76382ba42d9e4fc65eb13807ea329f1f95e0aea64c2011e972f8cc5b43b48865edd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
