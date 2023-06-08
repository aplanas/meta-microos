SUMMARY = "Haskell basement library documentation"
DESCRIPTION = "This package provides the Haskell basement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.15"

RPM_NAME = "ghc-basement-doc-0.0.15-2.3.noarch.rpm"
RPM_HASH = "7168d19d1bc930f181ffd63c3b2ba39d874c5268e4298be219673ffe34113f3691c7d2c9c60ef9a5fb1a6cfddd6289004418760aa2d492d84b430111b798cfde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-basement-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
