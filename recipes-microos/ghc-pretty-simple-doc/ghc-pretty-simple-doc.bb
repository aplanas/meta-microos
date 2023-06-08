SUMMARY = "Haskell pretty-simple library documentation"
DESCRIPTION = "This package provides the Haskell pretty-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-doc-4.1.2.0-1.3.noarch.rpm"
RPM_HASH = "8875a2b1bc8d53d874a528cb88d92b5bb5777173d2c9ba45ab28acf59e13b88ad9a2bb7843d654104ba9830291559642d17cd8ac63229a09d5d072dcb1708c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-simple-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
