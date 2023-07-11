SUMMARY = "Haskell math-functions library documentation"
DESCRIPTION = "This package provides the Haskell math-functions library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-doc-0.3.4.2-2.6.noarch.rpm"
RPM_HASH = "e78b9ccff7feb94b125fa92d0a1e4aa5fe1ac64f1f3166cfbc68becea0e3ab9fbbbf123997dd249a736cc31f7250e83dfc6359cd19f7cde61fc2c39084217f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-math-functions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
