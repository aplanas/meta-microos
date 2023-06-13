SUMMARY = "Haskell some profiling library"
DESCRIPTION = "This package provides the Haskell some profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-prof-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "8a213f8b852852d52fe34fbc5d97856af11e0d3092890e16ed762f50690752e4201b8c1963a630fd5e0263ec0b075d5bd8986256caadfd4d84a71b78067e062b"

RPROVIDES:${PN} += "ghc-prof(some-1.0.5-3dwCpkSImpx8T8axxRPR3Z) \
ghc-some-prof \
ghc-some-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-some-devel"

inherit rpm
