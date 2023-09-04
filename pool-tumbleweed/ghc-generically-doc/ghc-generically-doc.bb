SUMMARY = "Haskell generically library documentation"
DESCRIPTION = "This package provides the Haskell generically library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-doc-0.1.1-1.3.noarch.rpm"
RPM_HASH = "83189962129ff3b8f34dd6b18e17eddbf8a265f0c2ef6a581f4b52899e1e5af10d1c26654848188a1d99fa8b51276f3789e27e2b1f283d6ce519703ecb35eb58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-generically-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
