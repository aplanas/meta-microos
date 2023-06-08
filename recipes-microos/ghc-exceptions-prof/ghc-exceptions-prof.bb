SUMMARY = "Haskell exceptions profiling library"
DESCRIPTION = "This package provides the Haskell exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-prof-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "3bddb423663bcfe4869665e93d773ef276b4e7b8f66bc2e2989358d7e2cb7c4d48259aeea3e9375f7f0c44950e6189dbd3502f8b364265c725c966fe7f1355ce"

RPROVIDES:${PN} += "ghc-exceptions-prof ghc-exceptions-prof(aarch-64) ghc-prof(exceptions-0.10.5)"
RDEPENDS:${PN} += "ghc-exceptions-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(mtl-2.2.2) ghc-prof(stm-2.5.1.0) ghc-prof(template-haskell-2.19.0.0) ghc-prof(transformers-0.5.6.2)"

inherit rpm
