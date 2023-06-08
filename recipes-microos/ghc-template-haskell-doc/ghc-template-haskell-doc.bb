SUMMARY = "Haskell template-haskell library documentation"
DESCRIPTION = "This package provides the Haskell template-haskell library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-doc-2.19.0.0-1.1.noarch.rpm"
RPM_HASH = "4fb72d49533b6a92e6b15b8115c01271f92683068103b9f651c410100acff137528a3e0f07235bf181415217bfbb103065be096a66b0f550e1730d8b1c1c0efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-template-haskell-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
