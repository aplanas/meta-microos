SUMMARY = "Haskell prettyprinter library development files"
DESCRIPTION = "This package provides the Haskell prettyprinter library development files."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-devel-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "dafd84c93956b8e23b0bdd8328223e3460657d6f77629e215f7c7a6c17df8c3d502c0516f3386610c0473b0c845d9725c8e4a506986cf29b008dad854f2949ef"

RPROVIDES:${PN} += "ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prettyprinter-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-text-2.0.2 \
ghc-prettyprinter"

inherit rpm
