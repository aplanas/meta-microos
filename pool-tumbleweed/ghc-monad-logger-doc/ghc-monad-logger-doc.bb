SUMMARY = "Haskell monad-logger library documentation"
DESCRIPTION = "This package provides the Haskell monad-logger library documentation."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-doc-0.3.40-1.4.noarch.rpm"
RPM_HASH = "b3dfcb74b0cf2b1d6438bd5f5a4d244ea658561564f069640772aee70ce2f62a5f7f77ec300920e6e243a1c1ad6e491a0f12ecefd73a4f514ae0d38ebcc24348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
