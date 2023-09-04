SUMMARY = "Haskell bifunctors library documentation"
DESCRIPTION = "This package provides the Haskell bifunctors library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-doc-5.5.15-1.9.noarch.rpm"
RPM_HASH = "109f67900df52425b520d531af29fb99bbbba4ec11692a6d6bdf09365b806f0b8a81e105fc24454425018bbac8a20987d2bf0ff3baaa61aea7a8b0a03d5fbfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bifunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
