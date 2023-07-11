SUMMARY = "Haskell indexed-traversable-instances library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-doc-0.1.1.2-1.3.noarch.rpm"
RPM_HASH = "c5224e03c643efff5b8084a19233811ed5b20c40156eaa50d03b38d3ce2b22bbb74dade6e3bd249bed22cdbb6c48ba145461aad2682508b566fdd6f2b49dea9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
