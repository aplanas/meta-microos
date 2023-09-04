SUMMARY = "Haskell void library documentation"
DESCRIPTION = "This package provides the Haskell void library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-doc-0.7.3-6.3.noarch.rpm"
RPM_HASH = "5bef1c3559f20b469408ec52e0b2d18a101537e7586e4e73ae52aa1e1a55ad55dc7ddbe5b2062828762fbf374d478d28e1d70c9023599b6fe1ab33d2dad21645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-void-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
