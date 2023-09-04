SUMMARY = "Haskell doclayout library documentation"
DESCRIPTION = "This package provides the Haskell doclayout library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-doc-0.4.0.1-1.4.noarch.rpm"
RPM_HASH = "f1bdde9cf7662268e0d288608de2c58434aa530b1db528892c445926e20cc3de91a51770824cfad3444fbd9356cd59ca2d8431f7dc1614752eb1aa2f0dc809d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
