SUMMARY = "Haskell tasty-quickcheck library documentation"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library documentation."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-doc-0.10.2-2.5.noarch.rpm"
RPM_HASH = "f89740dd93e1600a2f314256c0753ad2e5e073a407953d33e95fcfa9f407015c69490234563f227d9956c3dc2a7ec0437059e3c3d58a1ffaac8dd1f795a9d0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-quickcheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
