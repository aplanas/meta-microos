SUMMARY = "Haskell mwc-random profiling library"
DESCRIPTION = "This package provides the Haskell mwc-random profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-prof-0.15.0.2-3.8.aarch64.rpm"
RPM_HASH = "7c4f454d5f77f395f6b6238f07e7f58b32339cc2694f941a038c6051b0b5d996d72881a00bbbc8cb6cf2870ada5e4739062956ffee9b56edbd6c829f1e30baa9"

RPROVIDES:${PN} += "ghc-mwc-random-prof \
ghc-prof-mwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp"

RDEPENDS:${PN} += "ghc-mwc-random-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-time-1.12.2 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
