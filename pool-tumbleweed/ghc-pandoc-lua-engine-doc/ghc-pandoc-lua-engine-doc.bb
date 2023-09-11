SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.2.0.1-1.16.noarch.rpm"
RPM_HASH = "8828537fe1d676c0973953d87d532c83c3a0dd35f69daab03f99ddc7cebc62f01ddab9100de373f9f5f40288e078aa0070f51811891c80488f251696e5d9c8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
