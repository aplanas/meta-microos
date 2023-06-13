SUMMARY = "Haskell data-fix profiling library"
DESCRIPTION = "This package provides the Haskell data-fix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-prof-0.3.2-4.2.aarch64.rpm"
RPM_HASH = "fdb849795a038df04554f8fc2731e3a9e14d58c99d8b3fa98821e99bdebb94ed178cd15e7d4bf94cf50d854181dacd21438b0fe60d20e6373c3155a20ca113c6"

RPROVIDES:${PN} += "ghc-data-fix-prof \
ghc-data-fix-prof(aarch-64) \
ghc-prof(data-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw)"

RDEPENDS:${PN} += "ghc-data-fix-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt)"

inherit rpm
