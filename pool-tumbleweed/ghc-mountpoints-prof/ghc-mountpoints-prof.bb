SUMMARY = "Haskell mountpoints profiling library"
DESCRIPTION = "This package provides the Haskell mountpoints profiling library."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-prof-1.0.2-4.2.aarch64.rpm"
RPM_HASH = "8407461d9315136b2a4b07bfe310852e352ec07e903050e076d44eea2e5491a64f335db1414bffa898d9d41f5309cac5a730e6ef5af960b1bad91bfd5c9f92fd"

RPROVIDES:${PN} += "ghc-mountpoints-prof \
ghc-mountpoints-prof(aarch-64) \
ghc-prof(mountpoints-1.0.2-1s316lA2PKMJiFY8pZCQYD)"
RDEPENDS:${PN} += "ghc-mountpoints-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
