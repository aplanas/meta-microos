SUMMARY = "Haskell pango profiling library"
DESCRIPTION = "This package provides the Haskell pango profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-prof-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "1cf97c1a3e68c6f2d63d3e1be9d6db142b312ef13434805d993a2bd266b2421a8cc8afee5cc5d07126b14caaf8947ede8918f08c5d46b607db215b6e185d1d49"

RPROVIDES:${PN} += "ghc-pango-prof \
ghc-prof-pango-0.13.10.0-FM47W5PFqW5BGqK9yscE4O"

RDEPENDS:${PN} += "ghc-pango-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-cairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-glib-0.13.10.0-FwtjszetdFF6KErN1CKeSg \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.17.0 \
ghc-prof-text-2.0.2"

inherit rpm
