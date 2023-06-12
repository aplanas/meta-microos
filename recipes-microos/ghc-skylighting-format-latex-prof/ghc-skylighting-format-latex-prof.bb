SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.3.aarch64.rpm"
RPM_HASH = "0ba9d5f590df46a83bb5f8d26f4137529f1ac8f979b694b9e9f0dc575e44706b46dd25e2d9504ce817117fc8d7b14499a7dc34576564a6db509a3bc3d005e342"

RPROVIDES:${PN} += "ghc-prof(skylighting-format-latex-0.1-BfMH5Wq0cc5AFSMLgsgxu) \
ghc-skylighting-format-latex-prof \
ghc-skylighting-format-latex-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63) \
ghc-prof(text-2.0.2) \
ghc-skylighting-format-latex-devel"

inherit rpm
