SUMMARY = "Haskell type-equality library documentation"
DESCRIPTION = "This package provides the Haskell type-equality library documentation."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-doc-1-11.3.noarch.rpm"
RPM_HASH = "23c182f839649e6db9e6a2bca32e301bb72914c9a8a2712beeb9efac35dbbb9eb058212a377c24c4c75e9fbe93cd8bff84eed975ebb3dadffb37125ba45db991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-type-equality-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
