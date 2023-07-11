SUMMARY = "Haskell simple-sendfile library documentation"
DESCRIPTION = "This package provides the Haskell simple-sendfile library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-doc-0.2.32-1.2.noarch.rpm"
RPM_HASH = "09b46214d716eb69264645f0ac6b86147917866e751dde2ca3ec54dcb0c746d4951b678835ec7d07d81e9644e2e005b4ce53aab8d8610a39501762c8e4040ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-simple-sendfile-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
