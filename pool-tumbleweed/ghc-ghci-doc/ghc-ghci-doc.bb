SUMMARY = "Haskell ghci library documentation"
DESCRIPTION = "This package provides the Haskell ghci library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-doc-9.4.5-3.1.noarch.rpm"
RPM_HASH = "4a8ab3de3ac32f9061c1afe85d5ed8883b5cd16967389adde40ed2dc97271745ba80bd00322f97f835121ee1130789ce83f1aeeeea8bddada1899ee040ba13cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghci-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
