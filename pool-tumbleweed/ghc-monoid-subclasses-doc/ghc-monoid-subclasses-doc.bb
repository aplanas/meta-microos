SUMMARY = "Haskell monoid-subclasses library documentation"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-doc-1.2.3-1.9.noarch.rpm"
RPM_HASH = "45ff36c8e80de8d1a4f7e4cfdb68d58ab0ffcdbbe32e89807f28de0abeb909e538c3207ac532cf982e2e5595d4c030b8ae0b9d410c08dcd1fe9507ecc4cd15f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monoid-subclasses-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
