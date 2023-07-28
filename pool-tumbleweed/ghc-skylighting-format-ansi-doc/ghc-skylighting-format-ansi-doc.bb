SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.5.noarch.rpm"
RPM_HASH = "fc43790be7884cde47ce64f55f4aea9b7e2510410eb8ffe9b91f70f2cfbf845aa51ad9517f33eabe09cc8687ff66a282820dd6f8106295584bd7f95a5649d245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
