SUMMARY = "Haskell byteorder library documentation"
DESCRIPTION = "This package provides the Haskell byteorder library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-doc-1.0.4-4.3.noarch.rpm"
RPM_HASH = "458ccf96b97d66e9350366970e027dea6923350f1d8266b74eddd846642a2abff7020c6cca0500d9c24752ac4f1991c0fe50964ede0c28d23569694a02901156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-byteorder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
