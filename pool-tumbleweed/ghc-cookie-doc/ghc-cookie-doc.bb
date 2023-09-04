SUMMARY = "Haskell cookie library documentation"
DESCRIPTION = "This package provides the Haskell cookie library documentation."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-doc-0.4.6-2.3.noarch.rpm"
RPM_HASH = "28518ac8ab406d0da2ac0654ac053a2a579c7aeb6477dc3a319ac2d5af7457f22b90f386db8507a29722ad5d60913c7b082f14b2b6c6789048f2c97f409e733d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cookie-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
