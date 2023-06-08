SUMMARY = "Haskell hslua-typing library documentation"
DESCRIPTION = "This package provides the Haskell hslua-typing library documentation."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-doc-0.1.0-1.2.noarch.rpm"
RPM_HASH = "d2daa8dc369fa3488a10c276b9c50b59a8810a7f901b3c3c7edef8cf55d1adaa218d3210e2f0ab0df2b6ac77aa7053c18e356ebec6df7e83190292a5b12f97b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-typing-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
