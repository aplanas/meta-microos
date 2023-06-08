SUMMARY = "Haskell mtl profiling library"
DESCRIPTION = "This package provides the Haskell mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-prof-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "498ef10e17b394f5d7453c9a21c6bdd9046c00fe0a21409fb31ed462edab6a0e1375cefef83dadb27879d0f05d6a9150fcbe1bc99149467a2da73bbb0dac44e8"

RPROVIDES:${PN} += "ghc-mtl-prof ghc-mtl-prof(aarch-64) ghc-prof(mtl-2.2.2)"
RDEPENDS:${PN} += "ghc-mtl-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(transformers-0.5.6.2)"

inherit rpm
