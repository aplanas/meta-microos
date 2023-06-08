SUMMARY = "Haskell containers profiling library"
DESCRIPTION = "This package provides the Haskell containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-prof-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "b9ff29e781b158f99dace635f2f4755760a072a70b6b1c70764c65eee0211a99355249801cf53b48acfe36ca577a5450ccdaa7a8b9a2f40f6137b1cfe4941dda"

RPROVIDES:${PN} += "ghc-containers-prof ghc-containers-prof(aarch-64) ghc-prof(containers-0.6.7)"
RDEPENDS:${PN} += "ghc-containers-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
