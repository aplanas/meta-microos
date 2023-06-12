SUMMARY = "Haskell typed-process library documentation"
DESCRIPTION = "This package provides the Haskell typed-process library documentation."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-doc-0.2.11.0-1.3.noarch.rpm"
RPM_HASH = "7de9cd242a45bac6b9f0e5fdafe81c96ff0d1763823f78615e45ae08b2880d0497d71f5c591e3627df6dbee925fe04434bc510ff754629bc76d2ffeb53722a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typed-process-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
