SUMMARY = "Haskell mono-traversable library documentation"
DESCRIPTION = "This package provides the Haskell mono-traversable library documentation."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-doc-1.0.15.3-2.10.noarch.rpm"
RPM_HASH = "3d5e0b2403dd2001720e1d550170c852dae7d06530bb167a741e1fda70ed026b0a8ae9254ba7c5ebeb3cbd46a817d84bb68ecb7c3b8cf26239f3db7657bf0d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mono-traversable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
