SUMMARY = "Haskell primitive library documentation"
DESCRIPTION = "This package provides the Haskell primitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-doc-0.7.4.0-1.8.noarch.rpm"
RPM_HASH = "91fe60263ebdbc88eeb6546fb1f2b121e8e65a004ba114b6b6760a8d53a7b866cae82d0875760dbcb76dec99077a02c7cdd04c7cf1d815036cabc5b132d46941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-primitive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
