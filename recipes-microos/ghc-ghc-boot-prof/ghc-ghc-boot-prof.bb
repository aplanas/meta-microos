SUMMARY = "Haskell ghc-boot profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-prof-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "4fbd471db5ab4c4f01849d0b4beb36f502faed88d53dc04c3a0a50ebd8100d3273ccdc0f6d4b1079e2a86f3b5c2daff90269d492f3fe02b2104f6c9ed4a21e61"

RPROVIDES:${PN} += "ghc-ghc-boot-prof ghc-ghc-boot-prof(aarch-64) ghc-prof(ghc-boot-9.4.5)"
RDEPENDS:${PN} += "ghc-ghc-boot-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2) ghc-prof(ghc-boot-th-9.4.5) ghc-prof(unix-2.7.3)"

inherit rpm
