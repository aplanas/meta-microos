SUMMARY = "Haskell libyaml library documentation"
DESCRIPTION = "This package provides the Haskell libyaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-doc-0.1.2-6.3.noarch.rpm"
RPM_HASH = "19120aa1d4ab222a8c80a81b2b17a487658419ea9da5eb4a818a2dfb5951ffc61b6b65912620a30488176138af2d3aa408a6de7bbc0a2b90a824ec6176c161dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libyaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
