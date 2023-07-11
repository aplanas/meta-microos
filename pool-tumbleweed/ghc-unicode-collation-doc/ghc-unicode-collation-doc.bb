SUMMARY = "Haskell unicode-collation library documentation"
DESCRIPTION = "This package provides the Haskell unicode-collation library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.4"

RPM_NAME = "ghc-unicode-collation-doc-0.1.3.4-1.6.noarch.rpm"
RPM_HASH = "96fde17ed88085d16d0cd8e2d954f07da9c0b09583cf07c31337f827e420714a9232a688a06b05296aeafb2fe74b48dea99f14b105fb0194575f1506df99267d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-collation-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
