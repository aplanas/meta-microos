SUMMARY = "Haskell skein library documentation"
DESCRIPTION = "This package provides the Haskell skein library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-doc-1.0.9.4-4.2.noarch.rpm"
RPM_HASH = "a3969cb7f04c88d44f4eed6691b42f493744962f7000ac74ca533ea17dbc9d2ec253a6e24b99e4326ebb1e3f863ac3878b03869ecddce9d13c2388425d9ea4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skein-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
