SUMMARY = "Haskell conduit library documentation"
DESCRIPTION = "This package provides the Haskell conduit library documentation."
LICENSE = "MIT"

PV = "1.3.4.3"

RPM_NAME = "ghc-conduit-doc-1.3.4.3-3.3.noarch.rpm"
RPM_HASH = "61e681b837123413a9071eb7c0b1a0204fea72bb3416f8a30b242a41aae799f197c2d37362d7567afaac601a3bf413a01c72024131ff259a125586f57d26be2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
