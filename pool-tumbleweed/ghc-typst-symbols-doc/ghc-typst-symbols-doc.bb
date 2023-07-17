SUMMARY = "Haskell typst-symbols library documentation"
DESCRIPTION = "This package provides the Haskell typst-symbols library documentation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-doc-0.1.2-1.1.noarch.rpm"
RPM_HASH = "660c965d328b36b6dd5a5caa3ebcfb2a4b3d0c2d2d8421c5c946a006c234fe58b2b92d791c8ef18f52ee1e4a043e4ab5a7ff9b68bd8fffe23b8fb7bab8cac7a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
