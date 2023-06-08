SUMMARY = "Haskell QuickCheck profiling library"
DESCRIPTION = "This package provides the Haskell QuickCheck profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.14.2"

RPM_NAME = "ghc-QuickCheck-prof-2.14.2-3.3.aarch64.rpm"
RPM_HASH = "0f5ce54ab2420e316c567409c02b2777491e75ecc23dfa80289d0c93108c3f3b123e187c2a45309d456c4c0c0b5d21bfce50792d4960e8fe93f9076229adc4c6"

RPROVIDES:${PN} += "ghc-QuickCheck-prof ghc-QuickCheck-prof(aarch-64) ghc-prof(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6)"
RDEPENDS:${PN} += "ghc-QuickCheck-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-prof(splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe) ghc-prof(template-haskell-2.19.0.0) ghc-prof(transformers-0.5.6.2)"

inherit rpm
