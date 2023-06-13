SUMMARY = "Haskell x509-store library documentation"
DESCRIPTION = "This package provides the Haskell x509-store library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-doc-1.6.9-2.3.noarch.rpm"
RPM_HASH = "8fe2d1a38aa6dd5d6db0c63632307e9f90b551cac8aa36879dde320efc20b177c4af566262bf038d040a68a07cce9f31aa5466fd8fe7bdb0b2624e4702f37840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-store-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
