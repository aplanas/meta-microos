SUMMARY = "Haskell xhtml library documentation"
DESCRIPTION = "This package provides the Haskell xhtml library documentation."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-doc-3000.2.2.1-3.2.noarch.rpm"
RPM_HASH = "02e633feb1582bba21b9820e533727425c93fea8c30528bdc3b77462ee35bf6a1c71de79487fd6cdaf0fa914bc0336b3b1e14d4798ad9cd7b94e9f66ad7d4f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xhtml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
