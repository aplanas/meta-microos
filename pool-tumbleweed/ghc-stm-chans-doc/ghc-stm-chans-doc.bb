SUMMARY = "Haskell stm-chans library documentation"
DESCRIPTION = "This package provides the Haskell stm-chans library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-doc-3.0.0.9-1.6.noarch.rpm"
RPM_HASH = "5c73695492fe1475c38c5fcbcf7be6031d9d2d8823ec6052e51244fdeeec1c9ecf75e52cb039db9b43e91b1057dde6993f8cbc393e53a93a08a468b700d6f4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-chans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
