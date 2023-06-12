SUMMARY = "Haskell stm library documentation"
DESCRIPTION = "This package provides the Haskell stm library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-doc-2.5.1.0-3.1.noarch.rpm"
RPM_HASH = "47f175c0d575059064eb91c5645605753d3997e34318f95fdc34bdaef5b68f39b251b213606d9c6e7fcedcfb020f8afbe2e5030b6aac960dc8661c474ac85879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
