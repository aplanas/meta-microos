SUMMARY = "Haskell monad-logger library documentation"
DESCRIPTION = "This package provides the Haskell monad-logger library documentation."
LICENSE = "MIT"

PV = "0.3.40"

RPM_NAME = "ghc-monad-logger-doc-0.3.40-1.8.noarch.rpm"
RPM_HASH = "6b76d5e47164ba36c7fb6f20ec41827e43318d048b0ab84f3657e372ce8a812556a0f83df11491456c7b0ea9cb8ddf0e1d824116d646ee40368ed04050d22f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
