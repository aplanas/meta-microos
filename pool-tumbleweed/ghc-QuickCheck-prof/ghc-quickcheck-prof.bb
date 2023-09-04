SUMMARY = "Haskell QuickCheck profiling library"
DESCRIPTION = "This package provides the Haskell QuickCheck profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.14.3"

RPM_NAME = "ghc-QuickCheck-prof-2.14.3-1.5.aarch64.rpm"
RPM_HASH = "a1234619a9772edc50423fae792939008d7804f63a87179d2b86fa4d823aa7ad45effa969f40bfe142002d281ef78dc559b9ede7e9a9e2354b4a71d4ebeb2d65"

RPROVIDES:${PN} += "ghc-QuickCheck-prof \
ghc-prof-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8"

RDEPENDS:${PN} += "ghc-QuickCheck-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-splitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
