SUMMARY = "Haskell appar library documentation"
DESCRIPTION = "This package provides the Haskell appar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-doc-0.1.8-4.3.noarch.rpm"
RPM_HASH = "680c021bcce5b0a44412692b10fcd3ee0ecfea3fc46c61b412e99ed6d5454173c76e3aa6193cc9f7438f9040820a905ad1ef4052e4f307693f3a1345300bfd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-appar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
