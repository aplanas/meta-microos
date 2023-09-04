SUMMARY = "Haskell mtl library documentation"
DESCRIPTION = "This package provides the Haskell mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-doc-2.2.2-1.1.noarch.rpm"
RPM_HASH = "d7a5e6a00c04748d71ca68b9f8268c72b3d7489c8285eddfd6d9661ca08d937e583a99910a27a96b13b7cd44fe4aefb9249b6a14a764d2ec61d41fe4b45498ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mtl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
