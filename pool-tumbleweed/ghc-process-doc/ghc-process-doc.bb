SUMMARY = "Haskell process library documentation"
DESCRIPTION = "This package provides the Haskell process library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.17.0"

RPM_NAME = "ghc-process-doc-1.6.17.0-1.1.noarch.rpm"
RPM_HASH = "88c2866f5a8acb5c95958654e87889dc3541e18fc15e6a31ee684e2d0dcc7775503cb6e927574b0745d31e3fa96f284354e41f83f599a4ec8e303eea9f4bb4d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
