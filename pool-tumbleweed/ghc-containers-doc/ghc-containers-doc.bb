SUMMARY = "Haskell containers library documentation"
DESCRIPTION = "This package provides the Haskell containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-doc-0.6.7-3.1.noarch.rpm"
RPM_HASH = "c451219c0564aa78a65d27d4f9ecbba3e81b308cc0c22c40c4032723c7816d28e876813197aec5b999153c1395f5ea17a77677b26a733311de57f90c89c0cb2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-containers-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
