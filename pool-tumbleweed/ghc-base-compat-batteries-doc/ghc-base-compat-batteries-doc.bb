SUMMARY = "Haskell base-compat-batteries library documentation"
DESCRIPTION = "This package provides the Haskell base-compat-batteries library documentation."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-doc-0.13.0-1.6.noarch.rpm"
RPM_HASH = "cd1ac7d205e40156ef1e4abbf45919debb4ee11f98341e8c5d12f777fca28e8c14de750e5bcdad559dbe57f6e60b0b2d17dcc32d194f6f4ddbd7ab4ce7283c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-batteries-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
