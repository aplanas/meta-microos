SUMMARY = "Haskell tasty-rerun library documentation"
DESCRIPTION = "This package provides the Haskell tasty-rerun library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-doc-1.1.18-6.3.noarch.rpm"
RPM_HASH = "999be66082bc141ca835bce7d5967964b459f47cdc84ee1b0756fb20f97fb9711e9dc8820e896df419f9fb466a58a5b13ae02525107ee84d00497bf45bc6ff86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-rerun-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
