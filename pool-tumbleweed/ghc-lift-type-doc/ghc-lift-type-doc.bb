SUMMARY = "Haskell lift-type library documentation"
DESCRIPTION = "This package provides the Haskell lift-type library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-doc-0.1.1.1-2.3.noarch.rpm"
RPM_HASH = "42c3c9ff9bec3492b4796dcd7451afcf0d433d103135fa4ebe109ee9cd495a486c56798437f4216e43ef574d0d9e0a234fec021d9f0844ab9d4b92b13a0908f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lift-type-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
