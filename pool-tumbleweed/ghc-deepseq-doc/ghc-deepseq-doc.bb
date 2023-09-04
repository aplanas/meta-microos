SUMMARY = "Haskell deepseq library documentation"
DESCRIPTION = "This package provides the Haskell deepseq library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-doc-1.4.8.0-1.1.noarch.rpm"
RPM_HASH = "303b295b9caae25ddf6d51b19dfc97830a018be4f897cdf4a2561aa5cb923e708af731effadeb73684245589c9ecbf7bed0c1128aad4e1e7e81c7418282339d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deepseq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
