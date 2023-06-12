SUMMARY = "Haskell exceptions library documentation"
DESCRIPTION = "This package provides the Haskell exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-doc-0.10.5-3.1.noarch.rpm"
RPM_HASH = "b188a894221e88ad782c8124d93dbb909d426747dc6eb1241eac0eaa7fd936a45f10dae6fa4a22454a52a7bffc5568dd0b3e88a28540d55450fc04e6a5dcb99d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-exceptions-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
