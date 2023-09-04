SUMMARY = "Haskell pretty-simple library development files"
DESCRIPTION = "This package provides the Haskell pretty-simple library development files."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-devel-4.1.2.0-1.8.aarch64.rpm"
RPM_HASH = "0e025de82c624dc1840a5f5bef9ed2cb2f01b884db8e3ba8162a32371a02895a0e87e5e4540b0561d9698e67abe27b51137d5da15369f95e50e42ab571d17a00"

RPROVIDES:${PN} += "ghc-devel-pretty-simple-4.1.2.0-I6NsimDP7f2Fl43nYTpHWu \
ghc-pretty-simple-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-devel-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-pretty-simple"

inherit rpm
