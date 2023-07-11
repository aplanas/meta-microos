SUMMARY = "Haskell xmonad library documentation"
DESCRIPTION = "This package provides the Haskell xmonad library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-doc-0.17.2-1.6.noarch.rpm"
RPM_HASH = "c88345c23234ac26891eb731cd9c22b9a8069f123011ad5ccd358b6128f4858b731682cbb1c5898f59c9e6562990f6de59f31edddd37f94f6e64292d6d31828f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
