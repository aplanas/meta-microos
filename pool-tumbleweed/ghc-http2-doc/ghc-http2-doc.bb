SUMMARY = "Haskell http2 library documentation"
DESCRIPTION = "This package provides the Haskell http2 library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-doc-3.0.3-2.10.noarch.rpm"
RPM_HASH = "04bbf70809f38452c276ca745f1a2475f1677c88ae930a770ed0b962e5fe3e228c30f37fa97b9bc458c71dd4ed7b8fe53f7c757e813ad6105b8420550edfcaaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http2-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
