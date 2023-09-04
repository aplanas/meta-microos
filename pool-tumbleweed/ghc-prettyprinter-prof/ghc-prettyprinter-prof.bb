SUMMARY = "Haskell prettyprinter profiling library"
DESCRIPTION = "This package provides the Haskell prettyprinter profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-prof-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "0f522901f5ff209aa75ce6faf3f54b8f2a50dcc74a1fa4b0c8d1bfc38b1e0ee9d9e95384151c7ebb41b2e356e46a9e1004aa42978f6a11f016af4c771db9c061"

RPROVIDES:${PN} += "ghc-prettyprinter-prof \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB"

RDEPENDS:${PN} += "ghc-prettyprinter-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-text-2.0.2"

inherit rpm
