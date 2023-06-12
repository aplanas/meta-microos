SUMMARY = "Haskell split profiling library"
DESCRIPTION = "This package provides the Haskell split profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-prof-0.2.3.5-2.2.aarch64.rpm"
RPM_HASH = "a94ee580ca04eeda6b9161198d7be6714b3e81df2fa1ec506db614fee6183b182e6f653cbc0cc85737fc7647f29e0d7cf05c72cf12265f0c04e51264352fccf6"

RPROVIDES:${PN} += "ghc-prof(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) \
ghc-split-prof \
ghc-split-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-split-devel"

inherit rpm
