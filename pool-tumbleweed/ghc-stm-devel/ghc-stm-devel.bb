SUMMARY = "Haskell stm library development files"
DESCRIPTION = "This package provides the Haskell stm library development files."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-devel-2.5.1.0-3.1.aarch64.rpm"
RPM_HASH = "02ad578e5476751110876decc51e7a11e93afae87824a4573172d0f9dc7de51c5eb2100646f1cbc38122ed44c3b5031f773e5a59d9cbfd88ae8eb454a9dc986f"

RPROVIDES:${PN} += "ghc-devel(stm-2.5.1.0) \
ghc-stm-devel \
ghc-stm-devel(aarch-64) \
ghc-stm-static \
ghc-stm-static(aarch-64)"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-stm(aarch-64)"

inherit rpm
