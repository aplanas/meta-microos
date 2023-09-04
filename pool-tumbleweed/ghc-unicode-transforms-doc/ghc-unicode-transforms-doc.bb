SUMMARY = "Haskell unicode-transforms library documentation"
DESCRIPTION = "This package provides the Haskell unicode-transforms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-doc-0.4.0.1-4.8.noarch.rpm"
RPM_HASH = "5e18ff71559d7553a55f5d260cbdd49a672e27582ecb1ede9a98f802b9694d4d5e265abad706de7128f9235f76032eeaacd487c86f67498724d2756a0ea26cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-transforms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
