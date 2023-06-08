SUMMARY = "Haskell Diff profiling library"
DESCRIPTION = "This package provides the Haskell Diff profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-prof-0.4.1-2.3.aarch64.rpm"
RPM_HASH = "20f9240980e769a3e850b56c04743f6fe2a3b88c6cc80bbf94c2225082467db9bfaefd3b408fe09ff0476480012b0daf7c17f53668371aec88042d8b772256b8"

RPROVIDES:${PN} += "ghc-Diff-prof ghc-Diff-prof(aarch-64) ghc-prof(Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP)"
RDEPENDS:${PN} += "ghc-Diff-devel ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(pretty-1.1.3.6)"

inherit rpm
