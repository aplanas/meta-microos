SUMMARY = "Haskell aeson library documentation"
DESCRIPTION = "This package provides the Haskell aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-doc-2.1.2.1-1.6.noarch.rpm"
RPM_HASH = "edff0b79b73a6f77f87f99d11aa128630b6a90fe1fbab4cfdec4a659bbc12333f1d57843f61c3778c9c4cfedc3c628a6e2be4bce0bc206e41c32856fdc722229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
