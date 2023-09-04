SUMMARY = "Haskell Diff profiling library"
DESCRIPTION = "This package provides the Haskell Diff profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-prof-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "a6c7b256d46ed978c2f17e11fa13fb43efcce38ffcbb7bf4682627e33d000df20098f331b261959604253d7d730fbb3dfc938e80a5366500eab7388eba8acd87"

RPROVIDES:${PN} += "ghc-Diff-prof \
ghc-prof-Diff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg"

RDEPENDS:${PN} += "ghc-Diff-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-pretty-1.1.3.6"

inherit rpm
