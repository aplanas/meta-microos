SUMMARY = "Haskell xhtml profiling library"
DESCRIPTION = "This package provides the Haskell xhtml profiling library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-prof-3000.2.2.1-3.2.aarch64.rpm"
RPM_HASH = "81e3b1a5b014dc9fcbd6d2ff893064ae2de2d17c85d702bfb08608de059a67738ebb1b2ac5610f592b5627f0eba5643a481e6b4f841a38eee939dabf1653e610"

RPROVIDES:${PN} += "ghc-prof-xhtml-3000.2.2.1 \
ghc-xhtml-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-xhtml-devel"

inherit rpm
