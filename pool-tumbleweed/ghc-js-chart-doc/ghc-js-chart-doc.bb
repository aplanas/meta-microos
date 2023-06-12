SUMMARY = "Haskell js-chart library documentation"
DESCRIPTION = "This package provides the Haskell js-chart library documentation."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-doc-2.9.4.1-2.2.noarch.rpm"
RPM_HASH = "54fc705ddf49a765eebbf661514b3a97a22e148e2f2d2f4d4335ac1a7f32f2aac6f79d907374f2056808a41402a32d0387983af21048833e3dfd102b1b740b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-js-chart-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
