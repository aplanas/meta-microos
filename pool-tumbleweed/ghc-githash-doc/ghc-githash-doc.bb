SUMMARY = "Haskell githash library documentation"
DESCRIPTION = "This package provides the Haskell githash library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-doc-0.1.7.0-1.5.noarch.rpm"
RPM_HASH = "5553db8ad656cb5a1df6e5cd9fd2ffc8b43dc8de1ba617f0c764b35bd98e1ee079f41657ca2c54e20d7910863a7c33a82be3ce03cf24c2184f5405e069e9bb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-githash-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
