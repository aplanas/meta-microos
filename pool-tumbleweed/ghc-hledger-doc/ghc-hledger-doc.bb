SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-doc-1.28-3.1.noarch.rpm"
RPM_HASH = "821e6261c8abb903e0e18d077d4eeca0347f5982f5b92bcafc28bba41b8808e36d86588e76466d1827cbbf77c465bd8cad41416fab043ecb410a01982d024e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
