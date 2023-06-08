SUMMARY = "Haskell filepath library development files"
DESCRIPTION = "This package provides the Haskell filepath library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-devel-1.4.2.2-1.1.aarch64.rpm"
RPM_HASH = "9b191e901de65ea399201f0785199f7aa72da346afce56225816e0be56e57a881f48ebb2dd0ecd5cddc068d37f1c95efd7274ad3e6d8aeaf32059021e9923890"

RPROVIDES:${PN} += "ghc-devel(filepath-1.4.2.2) ghc-filepath-devel ghc-filepath-devel(aarch-64) ghc-filepath-static ghc-filepath-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-filepath(aarch-64)"

inherit rpm
