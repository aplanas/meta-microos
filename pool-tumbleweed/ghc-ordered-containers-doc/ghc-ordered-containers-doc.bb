SUMMARY = "Haskell ordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell ordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-doc-0.2.3-1.5.noarch.rpm"
RPM_HASH = "5072e7d4ec9b90793af93e048d63687e8f955bbddc6e0f31b17a9dbc01c6ab6a475fd8484296f34eaf041f4af7d455837ad4d108acf87d962fac47b56c2c0ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
