SUMMARY = "Haskell cereal library documentation"
DESCRIPTION = "This package provides the Haskell cereal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-doc-0.5.8.3-2.8.noarch.rpm"
RPM_HASH = "401c4eded3c002a8910f56630d3500c495df3421121d640c4f405cf33712afe4c44d98bbb97b09858e198abf45627064bef4d86ad79ec5ddbe258d32668c4c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cereal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
