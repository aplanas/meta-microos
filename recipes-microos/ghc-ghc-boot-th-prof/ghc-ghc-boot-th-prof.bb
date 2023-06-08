SUMMARY = "Haskell ghc-boot-th profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-prof-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "b633bef5ca796230bb5631fc0262e29dbd9666e444ca797cce521f45f186b0d9720417163b6a81cf2cdc112349e202611aa80caeb945280fa0e299ea42f56b2e"

RPROVIDES:${PN} += "ghc-ghc-boot-th-prof ghc-ghc-boot-th-prof(aarch-64) ghc-prof(ghc-boot-th-9.4.5)"
RDEPENDS:${PN} += "ghc-ghc-boot-th-devel(aarch-64) ghc-prof(base-4.17.1.0)"

inherit rpm
