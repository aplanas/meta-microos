SUMMARY = "Haskell unicode-collation library documentation"
DESCRIPTION = "This package provides the Haskell unicode-collation library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.5"

RPM_NAME = "ghc-unicode-collation-doc-0.1.3.5-1.1.noarch.rpm"
RPM_HASH = "b2cee61d302bef740b6b06543217e000ab659ae6ff49d4b37f33f49df19d3cee0286b6ac34eb7fb555965808749a6d8339e1f5b8948b3c0e142b4ace2d51edc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-collation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
