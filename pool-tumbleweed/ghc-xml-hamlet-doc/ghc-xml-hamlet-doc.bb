SUMMARY = "Haskell xml-hamlet library documentation"
DESCRIPTION = "This package provides the Haskell xml-hamlet library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-doc-0.5.0.2-2.10.noarch.rpm"
RPM_HASH = "9b9821638f24050ad9e4f421e92d9654d61cf11b89c6267a6b018c4f363ee3488afa412226a167198d5f90fc587bed0064a1b89872c34516872c1cf8a2dc2d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-hamlet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
