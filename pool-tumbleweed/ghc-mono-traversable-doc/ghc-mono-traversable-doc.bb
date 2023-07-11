SUMMARY = "Haskell mono-traversable library documentation"
DESCRIPTION = "This package provides the Haskell mono-traversable library documentation."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-doc-1.0.15.3-2.6.noarch.rpm"
RPM_HASH = "18311abfca927f18cd6c0589b2dc2815785d34cadcf390a3161b13d7d242a38f3ca169779d535952bb92bc5058fc6ed8330e8d980aae046f9832a8831295d858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mono-traversable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
