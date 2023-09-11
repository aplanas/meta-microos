SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-core-doc-0.13.4.1-1.6.noarch.rpm"
RPM_HASH = "36660bd0a2432b2ce967ae0a6356650a1b3a77f6f740b483dd6267310da794cc6c6337576259ab8d1354c625bf1ce9f04fbc8546a608272a40a33e20aa7d7b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
