SUMMARY = "Haskell strict library documentation"
DESCRIPTION = "This package provides the Haskell strict library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-strict-doc-0.4.0.1-6.3.noarch.rpm"
RPM_HASH = "51121016ddbb2018402cc4aab8678c52e8dca12fb3f47ef42c354dd29919cc4ac389f5740f5d88fa4b2c2fef9d4d7500f6e6a02666faafc06f15b5779898ae8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-strict-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
