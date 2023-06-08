SUMMARY = "GHC manual"
DESCRIPTION = "This package provides the User Guide and Haddock manual."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-manual-9.4.5-1.1.noarch.rpm"
RPM_HASH = "2c667f54246682a6ca71ff1c3a94369f15c3f2d0b15a85ed8fbd5baee66247e13b79bb78d75b8de00bac021086cd25b51183dbbd6d86700eb17000722c0a94e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-manual"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
