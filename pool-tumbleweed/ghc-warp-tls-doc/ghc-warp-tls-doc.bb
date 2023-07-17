SUMMARY = "Haskell warp-tls library documentation"
DESCRIPTION = "This package provides the Haskell warp-tls library documentation."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-doc-3.3.6-1.7.noarch.rpm"
RPM_HASH = "1597250b6130f59974ef98a4c6a322e0e9886230bbacaadc72cbdc9902e75523ed3ec87b6f23920d649ae627be78e9849fb4006f46c14f4bd9100244b8d6cfac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
