SUMMARY = "Haskell refact library documentation"
DESCRIPTION = "This package provides the Haskell refact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-doc-0.3.0.2-4.3.noarch.rpm"
RPM_HASH = "8b5ae88af408a54b86e6b803ab5d237f58985ea087ae8a5b807f182261a2aaf9c35281f3330e303f06c5126d9b47d7cef79cbddcf076acd1f64a5521455f3a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-refact-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
