SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8.1"

RPM_NAME = "ghc-texmath-doc-0.12.8.1-1.1.noarch.rpm"
RPM_HASH = "79b4d630bccb0d6d456266989b39a046346914a0c028f7cd4dc968e74b395ba15ca4f9017123d016a2c279a97d25b32d594db020e8a9e061d59fae3cc57526b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
