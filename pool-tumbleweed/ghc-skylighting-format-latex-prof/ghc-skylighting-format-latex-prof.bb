SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.5.aarch64.rpm"
RPM_HASH = "846173040bfd68a4f293f1fec52618b5b39de1f9db4393991969980d59bb81793310c819d4183f3ef503fcc31a23b3437c5b849a02c0b535240355b43df2c44d"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-latex-0.1-KUWKzkdJqvB1foV6pwv6yZ \
ghc-skylighting-format-latex-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-latex-devel"

inherit rpm
