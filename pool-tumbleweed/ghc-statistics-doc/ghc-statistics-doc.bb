SUMMARY = "Haskell statistics library documentation"
DESCRIPTION = "This package provides the Haskell statistics library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-doc-0.16.2.0-1.10.noarch.rpm"
RPM_HASH = "7fd33b015a823bc92e740b849541021b6b5a550cd19fe45ac13570476219c2a7a4cbd6547bc5f670e9ecfa38692599a27e7f500bb924077509cb3d87d6e7e7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-statistics-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
