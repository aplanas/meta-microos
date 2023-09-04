SUMMARY = "Haskell optparse-applicative profiling library"
DESCRIPTION = "This package provides the Haskell optparse-applicative profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-prof-0.18.1.0-1.5.aarch64.rpm"
RPM_HASH = "85c414e37fb4fe1c222d99483b4e45ed5f1359ec7b9b52e2ff196b8070f588c0a71588b469fdc2e0e0588440ee2cae8d947a912b4a2d381744c2dcdb92e10b8c"

RPROVIDES:${PN} += "ghc-optparse-applicative-prof \
ghc-prof-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm"

RDEPENDS:${PN} += "ghc-optparse-applicative-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm
