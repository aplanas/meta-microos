SUMMARY = "Haskell parser-combinators library documentation"
DESCRIPTION = "This package provides the Haskell parser-combinators library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-doc-1.3.0-2.8.noarch.rpm"
RPM_HASH = "2a1344686dc9cc47ded5977c52106e17b96458e8795fd4abb9ee819123eceb5144b2dba5733bac01f81306e3f911a4e2bd7a6f1906bf4ed58b599371b50dcd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parser-combinators-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
