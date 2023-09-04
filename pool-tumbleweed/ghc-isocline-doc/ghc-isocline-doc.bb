SUMMARY = "Haskell isocline library documentation"
DESCRIPTION = "This package provides the Haskell isocline library documentation."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-doc-1.0.9-1.8.noarch.rpm"
RPM_HASH = "798d9bfe857fd02e5290d13313cf8e709d9b35f56a9a520c1ec5ecc8c993ba34f84a9290f2e8abebd074675e8e874734882b6894891e69942e0118a20b22231c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-isocline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
