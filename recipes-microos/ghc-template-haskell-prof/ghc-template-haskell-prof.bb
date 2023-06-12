SUMMARY = "Haskell template-haskell profiling library"
DESCRIPTION = "This package provides the Haskell template-haskell profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-prof-2.19.0.0-3.1.aarch64.rpm"
RPM_HASH = "c88d8232e3e719462f73f6a3821a244f3f0fd26c7449413d69bee380c9257a1b5ba343fa4ad5b6ad14a203da54578798b0a45a37f2b6163a398b85796a2e193e"

RPROVIDES:${PN} += "ghc-prof(template-haskell-2.19.0.0) \
ghc-template-haskell-prof \
ghc-template-haskell-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-boot-th-9.4.5) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(pretty-1.1.3.6) \
ghc-template-haskell-devel(aarch-64)"

inherit rpm
