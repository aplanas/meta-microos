SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-doc-3.1.3-1.5.noarch.rpm"
RPM_HASH = "e79576601c182532562647f6a41471537e797f024a30e475c1218ccd429c3d694cbfb7f813b71d92c53aa58cd8fec130a9b4afa0d8eddb0256d6c650b9793d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
