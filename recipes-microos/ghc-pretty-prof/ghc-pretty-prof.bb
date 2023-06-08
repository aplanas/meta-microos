SUMMARY = "Haskell pretty profiling library"
DESCRIPTION = "This package provides the Haskell pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-prof-1.1.3.6-1.1.aarch64.rpm"
RPM_HASH = "7134abcb50b9feb7739a09fd2680ff75e983dc4e72665c1c2807cfce956967f20e908306930c49fb29f36ef3b41639d12cd8e65e80af48187deb3bccbeb6ca4d"

RPROVIDES:${PN} += "ghc-pretty-prof ghc-pretty-prof(aarch-64) ghc-prof(pretty-1.1.3.6)"
RDEPENDS:${PN} += "ghc-pretty-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0)"

inherit rpm
