SUMMARY = "Haskell Decimal profiling library"
DESCRIPTION = "This package provides the Haskell Decimal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-prof-0.5.2-2.2.aarch64.rpm"
RPM_HASH = "8cfbeeb2708d6350420a358417e2e3672403424af8510dc1ee0e72b746d0f603a74ff16e93fe70ecf08e3f5324cb2dcda6ee12b2b1e513a3cb5f24de10757d03"

RPROVIDES:${PN} += "ghc-Decimal-prof ghc-Decimal-prof(aarch-64) ghc-prof(Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX)"
RDEPENDS:${PN} += "ghc-Decimal-devel ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0)"

inherit rpm
