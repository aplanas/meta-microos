SUMMARY = "Haskell primitive profiling library"
DESCRIPTION = "This package provides the Haskell primitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-prof-0.7.4.0-1.3.aarch64.rpm"
RPM_HASH = "aca14ccbf0e198e0823c1c20f4c4cc011be4744b174734b85277ce933a7e24dd7599fe9b87d78c12ac6b90a1cf75f752af5182048a3a3e743bd89fba843c6caf"

RPROVIDES:${PN} += "ghc-primitive-prof \
ghc-primitive-prof(aarch-64) \
ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq)"
RDEPENDS:${PN} += "ghc-primitive-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
