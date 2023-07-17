SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-doc-3.5-1.10.noarch.rpm"
RPM_HASH = "512fd19a9113ed8f249ee08527b08df8feba530ca6f7fc24f109b6dc39a40cdc16d51d270be46a1a5958eac2b39f90ee2d43915b33ec4f09a2cfb468aab26825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
