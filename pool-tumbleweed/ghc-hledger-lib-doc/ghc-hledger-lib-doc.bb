SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-doc-1.28-3.1.noarch.rpm"
RPM_HASH = "1d1debfd0973ab04102e42614204a96c5904f50e9a92608177f75b56d1520657d43092303dfca8ecc20951054715cddab9daf36a90e5d3c3cd0c354f8866ce1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
