SUMMARY = "Haskell tls library documentation"
DESCRIPTION = "This package provides the Haskell tls library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-doc-1.6.0-2.9.noarch.rpm"
RPM_HASH = "9a49806a3116cda5d67d523e4db06a3e65307e1e222f0b30e1ab125c18bc4a737a0095274159c2365f162736f1cd75d8810e4cb5ecfbe497a050e6be71315a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
