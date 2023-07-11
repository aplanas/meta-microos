SUMMARY = "Haskell ghc-heap library documentation"
DESCRIPTION = "This package provides the Haskell ghc-heap library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-doc-9.4.5-3.2.noarch.rpm"
RPM_HASH = "d9e2f38d064ffd968fe7352bf762f7d30c15a7d9cf5985648db4c99bf00a9b5a0deb26dd4b860819ed79da0c687e636bf326565d281edd2588b6224f2791bcbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-heap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
