SUMMARY = "Haskell filepath library documentation"
DESCRIPTION = "This package provides the Haskell filepath library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-doc-1.4.2.2-3.2.noarch.rpm"
RPM_HASH = "6b7b0aaa7a378d1d84cab5db40a6421815c40a67e338274a1ba3606e1782014516532768ede7948860fcfd6b73b8eacf6b7b4496c03a2730947cf390b6e91f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
