SUMMARY = "Haskell megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell megaparsec library documentation."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-doc-9.3.1-1.6.noarch.rpm"
RPM_HASH = "f02e2dedd700f53a60f67b566d56a7c3150ed83b58436853133406cbfa3e92f8e81869d1f114227533a127368cbeecf36b6c1b96948ec13d2340e7910e3066b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
