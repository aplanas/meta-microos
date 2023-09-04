SUMMARY = "Haskell data-fix library documentation"
DESCRIPTION = "This package provides the Haskell data-fix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-doc-0.3.2-4.4.noarch.rpm"
RPM_HASH = "33d98646c305d43418aefbac0fb6355e08e017b8ec689627fa672d79ca1f4fc543d4df882a12162f9c34c6e060d5536689a3061feab3d7bf9dc634e413e8a663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-fix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
