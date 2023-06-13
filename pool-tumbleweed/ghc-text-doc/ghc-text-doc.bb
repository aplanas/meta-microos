SUMMARY = "Haskell text library documentation"
DESCRIPTION = "This package provides the Haskell text library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-doc-2.0.2-3.1.noarch.rpm"
RPM_HASH = "15ec70c58824bcf3c66e61656d5f49fe7580802d0d4dc04ce7865e8fbff05959667c1b2becf77e89b3a36b9b5df661244cf1e8573be8e3c0dfb44920f8efa401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
