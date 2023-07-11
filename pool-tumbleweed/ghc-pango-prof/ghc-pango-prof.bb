SUMMARY = "Haskell pango profiling library"
DESCRIPTION = "This package provides the Haskell pango profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-prof-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "2abab0a1a3d87a3255d53f70761346264fa37445eccfce9569adcb71aeb90a925e88b9e37936e5bcd6057e61803fbad7786f7862304c1ba3f2d74e5038cd1235"

RPROVIDES:${PN} += "ghc-pango-prof \
ghc-prof-pango-0.13.10.0-Es56i1Q8thp2nfdEwUTWXD"

RDEPENDS:${PN} += "ghc-pango-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-cairo-0.13.10.0-79KHEyza8Yx2ITjvRp5k2b \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-glib-0.13.10.0-3OTFLQKlfVK7JIaqsLt0K \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0 \
ghc-prof-text-2.0.2"

inherit rpm
