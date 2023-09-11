SUMMARY = "Haskell skylighting-format-blaze-html library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-doc-0.1.1.1-1.1.noarch.rpm"
RPM_HASH = "4b5133586ba6bc8825cf8a9d730d3e5eebc27710337e6a2b8709b5b2b1290fb3efc4c62c3f37f13c4c9834ae9ad771357b58df550c0669b7e0841fcd17d0dbb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-blaze-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
