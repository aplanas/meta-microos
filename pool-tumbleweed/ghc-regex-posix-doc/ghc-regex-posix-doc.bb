SUMMARY = "Haskell regex-posix library documentation"
DESCRIPTION = "This package provides the Haskell regex-posix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-doc-0.96.0.1-3.6.noarch.rpm"
RPM_HASH = "891869d85f36255f27cd67ea5b07d4a62315619c1d9844f000f7621e210bbd6a51630c7874d98fa98d3640ae30a33aef50502f099a2504284c16bac79dc5580e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-posix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
