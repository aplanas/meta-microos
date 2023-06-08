SUMMARY = "Haskell deepseq library development files"
DESCRIPTION = "This package provides the Haskell deepseq library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-devel-1.4.8.0-1.1.aarch64.rpm"
RPM_HASH = "8c541a7fd1b487a2e68b8f63fbd4b12bb0dd932ecb240ba7a9b69a1ee2e50fc7f319d5bb9b0a7aee64784a0913e3a814d6dace58dafa066e7771f5a4776b1af1"

RPROVIDES:${PN} += "ghc-deepseq-devel ghc-deepseq-devel(aarch-64) ghc-deepseq-static ghc-deepseq-static(aarch-64) ghc-devel(deepseq-1.4.8.0)"
RDEPENDS:${PN} += "ghc-compiler ghc-deepseq(aarch-64) ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(ghc-prim-0.9.0)"

inherit rpm
