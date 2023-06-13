SUMMARY = "Haskell old-time library documentation"
DESCRIPTION = "This package provides the Haskell old-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-doc-1.1.0.3-13.2.noarch.rpm"
RPM_HASH = "2eb7d4724ff086b4852b47664a306b6d86f65b6bb7bafdbd0dfae8aaee144a264eeda69f3ad3b8371a1b6c82f68d4de405b4fa78433d5935385872c10d3dc11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
