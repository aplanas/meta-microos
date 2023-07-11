SUMMARY = "Haskell auto-update library documentation"
DESCRIPTION = "This package provides the Haskell auto-update library documentation."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-doc-0.1.6-6.6.noarch.rpm"
RPM_HASH = "a5929ec1d788f7c1700d1d1c8f4a729dee3cf1322a2aff3f519b92fbbede0fd11a566d25319a1454881ecbf324e394224d048e5c60823e79203b474be33f41b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-auto-update-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
