SUMMARY = "Haskell network-bsd library documentation"
DESCRIPTION = "This package provides the Haskell network-bsd library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-doc-2.8.1.0-8.1.noarch.rpm"
RPM_HASH = "981b6b6a49c966d2146f34502b5349434dd20f10cca12fb0475309a266f31bae78a2f87e633ca2cb96ca4076d4c0335bb36d09742cb073425689a4f4d9859f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-bsd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
