SUMMARY = "Haskell tagsoup library documentation"
DESCRIPTION = "This package provides the Haskell tagsoup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-doc-0.14.8-6.8.noarch.rpm"
RPM_HASH = "70d1f0fb00863447756bd0f22623af30a65c686e0cac7e6ba99b874c9772217444aa7b6924d4585710385c3f65b894c216358e12456c7aa1830c69d791838532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagsoup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
