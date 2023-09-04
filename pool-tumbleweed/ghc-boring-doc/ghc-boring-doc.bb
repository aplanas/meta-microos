SUMMARY = "Haskell boring library documentation"
DESCRIPTION = "This package provides the Haskell boring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-doc-0.2.1-1.4.noarch.rpm"
RPM_HASH = "66b1d3eea0023eb2e725219002b47251ebab36104803bcc4ef0120e78a37b6505e52b0837277786d2603c4f452b4995ae7cedd0c912104f4e9a5363ea5c8752e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-boring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
