SUMMARY = "Haskell comonad profiling library"
DESCRIPTION = "This package provides the Haskell comonad profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-prof-5.0.8-3.3.aarch64.rpm"
RPM_HASH = "a2f9867732c9624aea4bf7a0dd99b79d9e39edf6b1a0650a62fc3067b513f0bec5fe9c03c4f79182b4bdb64fa0dfefb58c239a2df360d48856127d02399232c1"

RPROVIDES:${PN} += "ghc-comonad-prof ghc-comonad-prof(aarch-64) ghc-prof(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4)"
RDEPENDS:${PN} += "ghc-comonad-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79) ghc-prof(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-prof(transformers-0.5.6.2) ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
