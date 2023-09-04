SUMMARY = "Haskell uuid library documentation"
DESCRIPTION = "This package provides the Haskell uuid library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-doc-1.3.15-4.9.noarch.rpm"
RPM_HASH = "4e3731cf4a870ff8163f6325c8633ce3cf39d62677c9f7c4fd6c85e1b3891ca98c097637fe8050ea7812919414481730a70f8358156c37f08d7eb73770057c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
