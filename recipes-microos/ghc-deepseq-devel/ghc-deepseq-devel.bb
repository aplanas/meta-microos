SUMMARY = "Haskell deepseq library development files"
DESCRIPTION = "This package provides the Haskell deepseq library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-devel-1.4.8.0-3.1.aarch64.rpm"
RPM_HASH = "649a780598a75448c82213ae3b89693c72e9578f35e36089be550a1dae41a62865a69f004684e6f28633042f4233558306645a06a6cb287ba8c7d650496a855f"

RPROVIDES:${PN} += "ghc-deepseq-devel \
ghc-deepseq-devel(aarch-64) \
ghc-deepseq-static \
ghc-deepseq-static(aarch-64) \
ghc-devel(deepseq-1.4.8.0)"
RDEPENDS:${PN} += "ghc-compiler \
ghc-deepseq(aarch-64) \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(ghc-prim-0.9.0)"

inherit rpm
