SUMMARY = "Haskell JuicyPixels library documentation"
DESCRIPTION = "This package provides the Haskell JuicyPixels library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-doc-3.3.8-1.8.noarch.rpm"
RPM_HASH = "7c2200dc0089a29e7c35fa19578ef58f39960b23848b26be4468ea0039086566c3c3da0d099e82ea567853fd1e4f759bdd8c4a5ff365cd67739edb031bc0c592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-JuicyPixels-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
