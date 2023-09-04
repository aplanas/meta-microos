SUMMARY = "Haskell word8 profiling library"
DESCRIPTION = "This package provides the Haskell word8 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-prof-0.1.3-5.8.aarch64.rpm"
RPM_HASH = "2d2a19bad2caad70b95306aaaccf4369a68fff23376fa319e3178d380d3cd1b43d874fb3f72cad24b47c056acf24e432668abcea256088388777899f5ff2c9d6"

RPROVIDES:${PN} += "ghc-prof-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-word8-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-word8-devel"

inherit rpm
