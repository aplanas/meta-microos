SUMMARY = "Haskell resourcet library documentation"
DESCRIPTION = "This package provides the Haskell resourcet library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-doc-1.2.6-2.3.noarch.rpm"
RPM_HASH = "e41ad5b7419d38661baa6d1e55d002f9ae69edc9a81198f6d17f8d9e4167f35171c6adef8aabfeff345491bc3f5ca01c6ab27ff09cd1915f366898d2b424a02c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resourcet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
