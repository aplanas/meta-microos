SUMMARY = "Haskell ghc-boot-th profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-th-prof-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "3307136eb5590756e51821685bbccb23c3c6e2d64ead4ce1c2aeeed67e6d53cb4b5c9599d5afe2ffe702c2ca29fa3408124a4c37fc4ab872e3f43c2e3902340c"

RPROVIDES:${PN} += "ghc-ghc-boot-th-prof \
ghc-prof-ghc-boot-th-9.4.6"

RDEPENDS:${PN} += "ghc-ghc-boot-th-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
