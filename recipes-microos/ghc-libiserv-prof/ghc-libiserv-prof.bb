SUMMARY = "Haskell libiserv profiling library"
DESCRIPTION = "This package provides the Haskell libiserv profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-prof-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "5acb50ee050afbdf5d7ff5342d1fa1f785b1148099af43c48a900bd91cd0c94bd1038ee0e33b5ebf720dfafeaee7db747313c31991f50774831b6e75058f3e67"

RPROVIDES:${PN} += "ghc-libiserv-prof ghc-libiserv-prof(aarch-64) ghc-prof(libiserv-9.4.5)"
RDEPENDS:${PN} += "ghc-libiserv-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghci-9.4.5) ghc-prof(unix-2.7.3)"

inherit rpm
