SUMMARY = "Haskell prettyprinter-ansi-terminal profiling library"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-prof-1.1.3-2.3.aarch64.rpm"
RPM_HASH = "72a8cd63cc3f2390644d9cc5712473ef3900ac739336b5cb7c3ae0e2163139c841637930cd7796895d97bf7af5886012c489ff46cbab7801607f7dbabe7c92f4"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal-prof \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2"

RDEPENDS:${PN} += "ghc-prettyprinter-ansi-terminal-devel \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prof-text-2.0.2"

inherit rpm
