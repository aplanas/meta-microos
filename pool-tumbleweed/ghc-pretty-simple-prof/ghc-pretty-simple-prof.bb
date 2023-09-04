SUMMARY = "Haskell pretty-simple profiling library"
DESCRIPTION = "This package provides the Haskell pretty-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-prof-4.1.2.0-1.8.aarch64.rpm"
RPM_HASH = "f7a58193b1ec5e73b8ab7f34f35fab41142c41b5a0c6e9ab4847aa08ad03a97aed71df4d616a8337a991763803e34e32e8417170f8b221a72e8aab3636b811c5"

RPROVIDES:${PN} += "ghc-pretty-simple-prof \
ghc-prof-pretty-simple-4.1.2.0-I6NsimDP7f2Fl43nYTpHWu"

RDEPENDS:${PN} += "ghc-pretty-simple-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
