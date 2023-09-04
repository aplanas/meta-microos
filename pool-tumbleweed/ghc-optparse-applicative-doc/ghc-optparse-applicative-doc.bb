SUMMARY = "Haskell optparse-applicative library documentation"
DESCRIPTION = "This package provides the Haskell optparse-applicative library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-doc-0.18.1.0-1.5.noarch.rpm"
RPM_HASH = "adf2785046b669f52213124b0a46e16a2ab8d6be03344ed8e0f874394f55d01acd77692a1e2fa64edc9a1795cb47a1eee45644d450dc3cf36e1c7be3a3036fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optparse-applicative-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
