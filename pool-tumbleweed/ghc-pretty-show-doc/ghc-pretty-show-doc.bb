SUMMARY = "Haskell pretty-show library documentation"
DESCRIPTION = "This package provides the Haskell pretty-show library documentation."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-doc-1.10-4.6.noarch.rpm"
RPM_HASH = "1d9893271a258b02c1a5866927c2af1f7aee930a3586ef91c753f795b90b5eff6682b0aacb515c21fbb85c0a6d66ccd8c4c2441d085aafa5bf813413b3c73dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-show-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
