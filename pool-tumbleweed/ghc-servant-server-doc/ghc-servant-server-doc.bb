SUMMARY = "Haskell servant-server library documentation"
DESCRIPTION = "This package provides the Haskell servant-server library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-doc-0.19.2-2.7.noarch.rpm"
RPM_HASH = "0c5ae4bc313e1588eda14eaea5aa88da52e0f0e993baef4e6b6f98d34571baeeb864897d12d10e35504170ca2e23adf9ee7ade9766e5b5b6e50120192f175433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
