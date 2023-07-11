SUMMARY = "Haskell ghc-lib-parser-ex library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-doc-9.4.0.0-1.6.noarch.rpm"
RPM_HASH = "d77de32fe5c5a8264e07189bd70753a6800dd1a40231e3d58874d96985d740dc6597f98a04c5c7668653904164a086df1007f8354c4544caa4f16fb1a8669bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
