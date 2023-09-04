SUMMARY = "Haskell servant library documentation"
DESCRIPTION = "This package provides the Haskell servant library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-doc-0.19.1-3.4.noarch.rpm"
RPM_HASH = "8e28f16bbe2453316be7d9feb306d4f14110f9938470899a944d0ebb7dd9aec96b6def68558f800039278d98b1b2775b59b5117dd711daa87f437c019e855a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
