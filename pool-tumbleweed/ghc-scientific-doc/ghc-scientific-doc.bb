SUMMARY = "Haskell scientific library documentation"
DESCRIPTION = "This package provides the Haskell scientific library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-doc-0.3.7.0-5.9.noarch.rpm"
RPM_HASH = "a1030861f439778750f2be61e47964ff6e28edafdeb37f903aa8e2d04147c709f9104498038014fd45f6cffa0c3b81902dced4d83216543c2e3808483d389f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-scientific-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
