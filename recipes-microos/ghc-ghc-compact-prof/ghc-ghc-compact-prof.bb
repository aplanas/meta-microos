SUMMARY = "Haskell ghc-compact profiling library"
DESCRIPTION = "This package provides the Haskell ghc-compact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-prof-0.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "805c4fbc8baab4675b603c5b6971c60110629f04cca1eba04ffd96a6b5e9094978307b736cd6436361926203bd97ea2364d57361beee59f39a51979c31bba795"

RPROVIDES:${PN} += "ghc-ghc-compact-prof ghc-ghc-compact-prof(aarch-64) ghc-prof(ghc-compact-0.1.0.0)"
RDEPENDS:${PN} += "ghc-ghc-compact-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(ghc-prim-0.9.0)"

inherit rpm
