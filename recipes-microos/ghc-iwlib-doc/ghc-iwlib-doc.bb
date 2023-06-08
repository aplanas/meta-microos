SUMMARY = "Haskell iwlib library documentation"
DESCRIPTION = "This package provides the Haskell iwlib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-doc-0.1.2-2.2.noarch.rpm"
RPM_HASH = "cb1462e7dc291b35e50839e87461d6e8c8400244b0b4098297d4809f0779ce3e882220f381a5bf23be8a992bba279221835acc16cf85552d171ce24998f497d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iwlib-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
