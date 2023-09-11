SUMMARY = "Haskell ghc-lib-parser library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.7.20230826"

RPM_NAME = "ghc-ghc-lib-parser-doc-9.4.7.20230826-1.1.noarch.rpm"
RPM_HASH = "add30c4e1e7db2ed38cde421f51a63e4b8ece8bdedd70d2752698ef55838bef640f987b564c1cbbf64d99bb527bb3d9a09a3f3cabe3c912c7731c95caa091c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
