SUMMARY = "Haskell free library documentation"
DESCRIPTION = "This package provides the Haskell free library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.1.10"

RPM_NAME = "ghc-free-doc-5.1.10-2.3.noarch.rpm"
RPM_HASH = "6f74d01965e7a3924d857c71ca29cb5064c702fff96a1683d2328c8905e9bac08d8b66ed37ef287ee196def12c60ba4b3eb2b161bcb1137dfc916e351eaaabbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-free-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
