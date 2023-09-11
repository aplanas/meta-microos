SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.11.aarch64.rpm"
RPM_HASH = "0634195bd529fb40b91dd47647817ee448c487503d40b1d142b00e84bc0b749e26e7faef81b1dcfeb60ac70a896b320a78cfa211363a57a8d631c0561942a948"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-latex-0.1-8a642fGNkPX9imnZQBlyrP \
ghc-skylighting-format-latex-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-latex-devel"

inherit rpm
