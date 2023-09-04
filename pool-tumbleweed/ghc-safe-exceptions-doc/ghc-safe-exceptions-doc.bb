SUMMARY = "Haskell safe-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell safe-exceptions library documentation."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-doc-0.1.7.4-1.2.noarch.rpm"
RPM_HASH = "898a8e212f337cbfa438d471ed400f90bf193c7a166042da5fd21a6ad73e2b954af151df2728e084316bf0dc02dc5f0bcf7a4dd9a856e9b0cd3d7a19f30436d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
