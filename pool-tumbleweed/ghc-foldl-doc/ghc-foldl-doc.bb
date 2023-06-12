SUMMARY = "Haskell foldl library documentation"
DESCRIPTION = "This package provides the Haskell foldl library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.14"

RPM_NAME = "ghc-foldl-doc-1.4.14-2.3.noarch.rpm"
RPM_HASH = "60b0c9a8c0adc14740c71f2d46ab3b596005db3576bf60def4625f0a330035d29f822c606e9c4f4073609f64930e1681d67d33cc0ab010ad33fa83f5156b5ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-foldl-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
