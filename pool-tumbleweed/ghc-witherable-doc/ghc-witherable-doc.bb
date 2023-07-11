SUMMARY = "Haskell witherable library documentation"
DESCRIPTION = "This package provides the Haskell witherable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-doc-0.4.2-4.3.noarch.rpm"
RPM_HASH = "2d3dbc969ffa6af4ed3bbe22323a73cbc6f5a2fff52fbf4a30530757795b8aadf9caf910824e26073ddb3620ed49dc8134152db56467d4966746288509959bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-witherable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
