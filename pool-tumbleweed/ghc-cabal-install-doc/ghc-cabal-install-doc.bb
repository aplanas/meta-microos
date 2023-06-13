SUMMARY = "Haskell cabal-install library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-doc-3.8.1.0-1.3.noarch.rpm"
RPM_HASH = "7d02e14c6e1fb446bc6a5742fd1488c9894cb229ee72be9b3949407b29b45d993a8a6ccbb8a1799ad13500dcf9b50e2a6e3dc8ef4f0ae4849f97eb16a5b440bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
