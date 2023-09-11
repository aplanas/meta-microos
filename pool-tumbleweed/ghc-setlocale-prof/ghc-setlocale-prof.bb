SUMMARY = "Haskell setlocale profiling library"
DESCRIPTION = "This package provides the Haskell setlocale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-prof-1.0.0.10-5.1.aarch64.rpm"
RPM_HASH = "d148950b6611fb8b72d25082de64f1e340efce3f1aba0ea44f8121c67495840c626afeff8e65df4e2f5c1742673d8c61ff304a7e5b9831001387b2e4c53bfe02"

RPROVIDES:${PN} += "ghc-prof-setlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V \
ghc-setlocale-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-setlocale-devel"

inherit rpm
