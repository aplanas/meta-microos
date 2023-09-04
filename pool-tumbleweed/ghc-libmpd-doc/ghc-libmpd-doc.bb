SUMMARY = "Haskell libmpd library documentation"
DESCRIPTION = "This package provides the Haskell libmpd library documentation."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-doc-0.10.0.0-2.11.noarch.rpm"
RPM_HASH = "34b85e0050e848806686d0596f79d83889771da3ef6addc1034e4f7bec0d47585786407388e55574288bcee3075d45634e04322ca4f2d6f7da3f79fd04503240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libmpd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
