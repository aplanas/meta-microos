SUMMARY = "Haskell optparse-applicative library documentation"
DESCRIPTION = "This package provides the Haskell optparse-applicative library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.17.0.0"

RPM_NAME = "ghc-optparse-applicative-doc-0.17.0.0-2.3.noarch.rpm"
RPM_HASH = "00155bd6fa5991f11a683645fd693db1d1e88e784c717516a58b7db72aa2ad8480e7dab71d4320380170c2598f52dac99b94b60bd65bb7c177cd1d943bdc4b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optparse-applicative-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
