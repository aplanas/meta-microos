SUMMARY = "Haskell zip-archive library documentation"
DESCRIPTION = "This package provides the Haskell zip-archive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-doc-0.4.3-1.2.noarch.rpm"
RPM_HASH = "0a4b89ff90f88b9758c485365b8c78993e1869bf6f7eaa7c730cc1f7e3e8e973645317cd9b80c9f1b4b2de543887f230a01a82c1ca3d2284b801d95524b43e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zip-archive-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
