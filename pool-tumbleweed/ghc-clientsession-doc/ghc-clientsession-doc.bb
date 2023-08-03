SUMMARY = "Haskell clientsession library documentation"
DESCRIPTION = "This package provides the Haskell clientsession library documentation."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-doc-0.9.2.0-2.1.noarch.rpm"
RPM_HASH = "09d073a7456d2267c8ddac9ec7b49793cf8013d3accfade59b734b017c3620b0517ef0d97a9e67110f15052ce979bfacc3763e9d736a03fffe85c87846d26764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clientsession-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
