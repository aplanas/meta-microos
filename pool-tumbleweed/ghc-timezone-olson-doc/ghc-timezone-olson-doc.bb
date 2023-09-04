SUMMARY = "Haskell timezone-olson library documentation"
DESCRIPTION = "This package provides the Haskell timezone-olson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-doc-0.2.1-2.8.noarch.rpm"
RPM_HASH = "4ffd78804305bfaa07a64109e8047e9f4a6b72e3db0419d77490f1ed12ef1e7097c623b338bd8d7be93718ee4272828f53a10f9bf71da01c30769c192d30aaaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-olson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
