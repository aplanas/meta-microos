SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-doc-1.28-3.8.noarch.rpm"
RPM_HASH = "91879cd6a8ab17dd676fc62d67aa07be3cf40e082b003539186bba9de0d7a942537e4676c3dbaa19fd0b6913c219a03d78804967f76e4ce966fb6870749916f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
