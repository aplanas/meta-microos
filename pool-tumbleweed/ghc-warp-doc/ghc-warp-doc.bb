SUMMARY = "Haskell warp library documentation"
DESCRIPTION = "This package provides the Haskell warp library documentation."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-doc-3.3.25-1.7.noarch.rpm"
RPM_HASH = "8da37d2d3712aca04a9300e4facdad89f1198c0421a5e4a53fb12e539ad56e0db243dcdd7b358856b71a3979099ae17e4594d7962c254cdcec6f41c500523945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
