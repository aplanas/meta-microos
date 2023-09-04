SUMMARY = "Haskell transformers library documentation"
DESCRIPTION = "This package provides the Haskell transformers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-doc-0.5.6.2-1.1.noarch.rpm"
RPM_HASH = "3b8ff9951b1a50834370839dccae9a51f9d51141e8d223f490c634494cb4c366152483b43b620d84bcb9f9c2c0d0fea84d106252cfaaa0ac047f1df0c92813be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
