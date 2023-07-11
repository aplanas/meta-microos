SUMMARY = "Haskell foldl library documentation"
DESCRIPTION = "This package provides the Haskell foldl library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.14"

RPM_NAME = "ghc-foldl-doc-1.4.14-2.6.noarch.rpm"
RPM_HASH = "0251294d57035541a9f1b1d59d78968e25ec200b2bfffeeb74827f4dedce443106fa9e84deec61361e1e5d14bf655b1454f05620fea40a2d6e9438b2b61df9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-foldl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
