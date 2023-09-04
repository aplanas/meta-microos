SUMMARY = "Haskell parallel library documentation"
DESCRIPTION = "This package provides the Haskell parallel library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-doc-3.2.2.0-12.8.noarch.rpm"
RPM_HASH = "1138de4ab9eba3f7b6dfcb2013610dbeb5410ec7d390b90299caa4e1bec54a4af13bbd316c232dcd242c3defb62f13ae1d7b5e249b954ce9500737d0ed678dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parallel-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
