SUMMARY = "Haskell psqueues profiling library"
DESCRIPTION = "This package provides the Haskell psqueues profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-prof-0.2.7.3-2.3.aarch64.rpm"
RPM_HASH = "57ce4bdd1be21ffafc94d2c8b7f5fad4a68de00f979ef769da965c90cee9e7ed673eeb921cdac26d9c3ded91ea5a44389eabacd9a2f533b4a0306af4f98e3888"

RPROVIDES:${PN} += "ghc-prof(psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O) ghc-psqueues-prof ghc-psqueues-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-psqueues-devel"

inherit rpm
