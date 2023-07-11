SUMMARY = "Haskell these library documentation"
DESCRIPTION = "This package provides the Haskell these library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-doc-1.2-1.3.noarch.rpm"
RPM_HASH = "6b32091385d4dd85f9a0960642fee3590ead2447a0a4d5126e4d6927627091c9861bccaa5556b8b562f12eeaafe16b587990b39d0bdbafbe210c404cb1d6e9a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-these-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
