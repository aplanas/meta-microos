SUMMARY = "Haskell optparse-applicative library development files"
DESCRIPTION = "This package provides the Haskell optparse-applicative library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-devel-0.18.1.0-1.5.aarch64.rpm"
RPM_HASH = "1f7d205ef59dea7a4160f37f239aaf2b27f550b981bf3b7aafd125c75b88e09964d4aa77a0a013dded0dbd1dc8f9acefb1b3d4c7567b1906057ca82422258f60"

RPROVIDES:${PN} += "ghc-devel-optparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm \
ghc-optparse-applicative-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-devel-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-optparse-applicative"

inherit rpm
