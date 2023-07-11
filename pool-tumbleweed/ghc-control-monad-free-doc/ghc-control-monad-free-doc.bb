SUMMARY = "Haskell control-monad-free library documentation"
DESCRIPTION = "This package provides the Haskell control-monad-free library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-doc-0.6.2-4.6.noarch.rpm"
RPM_HASH = "34f45a5bd6e469b93e776196ced99fc0f7fe2b2b0184df64fc37b9a7de539f84e6d94aa99d829772e121f1430894c8cee11b0af06810cd0af754eac31d286362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-control-monad-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
