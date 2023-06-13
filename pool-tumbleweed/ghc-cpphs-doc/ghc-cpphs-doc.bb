SUMMARY = "Haskell cpphs library documentation"
DESCRIPTION = "This package provides the Haskell cpphs library documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-doc-1.20.9.1-5.3.noarch.rpm"
RPM_HASH = "8e18d3aecb79bd2d10fe7f8ecd5a0943582a7d1e7575135e8d8321b1e418d2a259ae5f745de96b2e992db98597fb0eb62c12bae05b8df03cf463eca263ccb0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cpphs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
