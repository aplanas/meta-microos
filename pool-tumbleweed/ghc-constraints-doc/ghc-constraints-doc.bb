SUMMARY = "Haskell constraints library documentation"
DESCRIPTION = "This package provides the Haskell constraints library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-doc-0.13.4-3.2.noarch.rpm"
RPM_HASH = "262f24f240a670575657de9f74847e4ef624a1c031a75c310f8cfa5a49e086fcd5711c09e0f0c138db6e90e0858ba1514d8aa732e281d61fa577c03417a59dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-constraints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
