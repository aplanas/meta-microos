SUMMARY = "Haskell filepath-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-doc-1.4.2.1.13-1.5.noarch.rpm"
RPM_HASH = "6a338146d0652f52511dc7aacf82e3c14f716debf6fe478ad79c1f095646368624ae6c701d761c9a3246468a952ed4017fbe89e71ec17b81e8db9a0afc9a0d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
