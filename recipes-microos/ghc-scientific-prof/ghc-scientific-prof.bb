SUMMARY = "Haskell scientific profiling library"
DESCRIPTION = "This package provides the Haskell scientific profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-prof-0.3.7.0-5.3.aarch64.rpm"
RPM_HASH = "33da916cbe444928d3960c253c995ace6af048039a1f1d9ff7451c4703d735af4f2834451af1fa3e20e911a2da1d3d7c9269ba6daf415ed10257adf838d4de56"

RPROVIDES:${PN} += "ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) ghc-scientific-prof ghc-scientific-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-prof(integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu) ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-prof(template-haskell-2.19.0.0) ghc-prof(text-2.0.2) ghc-scientific-devel"

inherit rpm
