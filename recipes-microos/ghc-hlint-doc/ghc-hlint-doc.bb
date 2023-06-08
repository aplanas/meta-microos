SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-doc-3.5-1.4.noarch.rpm"
RPM_HASH = "03be6090673f025e0e406f562b46faa3392947e2464584753e17a9acdce0bc2c618e69fe05d64cfa3a52d89524e13f2131fe805111c1bf9d6299310e00e5f204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
