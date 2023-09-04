SUMMARY = "Haskell timezone-series library documentation"
DESCRIPTION = "This package provides the Haskell timezone-series library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-doc-0.1.13-2.3.noarch.rpm"
RPM_HASH = "a196d83510006328c0fb6083ff2af33770626955c9295e173f94820131f04c80f99ef639d446bb0eb45bd3c08ac164ffa34a302b8e6f928e0e27b02c5c6127e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-series-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
