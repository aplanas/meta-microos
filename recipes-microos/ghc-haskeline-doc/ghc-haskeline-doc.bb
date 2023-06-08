SUMMARY = "Haskell haskeline library documentation"
DESCRIPTION = "This package provides the Haskell haskeline library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-doc-0.8.2-1.1.noarch.rpm"
RPM_HASH = "e4013d57804421e9fc68e7ad61a73dec2a577de31bb54cea22124b83b5f7be3693efe445caff38351cb1b656a4c6a8ecf5a3d1e4d6738c0d52947a6854237628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskeline-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
