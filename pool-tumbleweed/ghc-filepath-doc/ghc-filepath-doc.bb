SUMMARY = "Haskell filepath library documentation"
DESCRIPTION = "This package provides the Haskell filepath library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-doc-1.4.2.2-1.1.noarch.rpm"
RPM_HASH = "c188a0a876af283a0938ad3985e9e636c619f8bdb209fd6f6441564c8017b116ab9f1a4059e3d11e914989090eb61ac0852a440b22d753fcd4d868e923044ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
