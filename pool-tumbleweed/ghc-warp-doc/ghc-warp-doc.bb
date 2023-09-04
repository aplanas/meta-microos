SUMMARY = "Haskell warp library documentation"
DESCRIPTION = "This package provides the Haskell warp library documentation."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-doc-3.3.25-1.13.noarch.rpm"
RPM_HASH = "f8c8fc9bb097a160847e168a619646f2192edba7ad5faa681bd33735f3d988f9c3de8ee3373e42075e04e467db555fbaf3016e61cdee5f6e6f0a35d0cdc79c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
