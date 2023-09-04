SUMMARY = "Haskell haddock-library library documentation"
DESCRIPTION = "This package provides the Haskell haddock-library library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-doc-1.11.0-2.8.noarch.rpm"
RPM_HASH = "fc719ef1c36ba286a9a25d0b6ada364f2d356e00ccb7d3e985bfdb1e61e94a275f31e294e7a51fa605f9c221c37252a5987a773944121288ddd07eda338a8ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haddock-library-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
