SUMMARY = "Haskell postgresql-simple library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.5.1"

RPM_NAME = "ghc-postgresql-simple-doc-0.6.5.1-1.1.noarch.rpm"
RPM_HASH = "989857f165b42f625addc089c9e806a89eac45ec7b7b548c37562d036ca56c674bd20a80ddf9efb0d4e8bf512cb229065f1ba2707c7fb782fb26e1343ed2d233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
