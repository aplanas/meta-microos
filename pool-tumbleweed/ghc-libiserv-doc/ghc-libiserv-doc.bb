SUMMARY = "Haskell libiserv library documentation"
DESCRIPTION = "This package provides the Haskell libiserv library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-doc-9.4.5-3.2.noarch.rpm"
RPM_HASH = "e04f82920ece9e9d2e7418fc04a22557e4ff160f5720de66ac0642aa36e9f1757975561ff655295a44a8a50722f6fa316f27585d8c915908e35e909a019bafed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libiserv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
