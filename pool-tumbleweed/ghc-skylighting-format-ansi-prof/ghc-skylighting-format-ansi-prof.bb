SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.3.aarch64.rpm"
RPM_HASH = "410370ebc38f963435f1ef5ef7b5d213b98408deda948f7a414f64312b46205401693f731b76b2fe388d234eecc87dde03ccfb15ea48804bc47e3d38db42d2b9"

RPROVIDES:${PN} += "ghc-prof(skylighting-format-ansi-0.1-37mK2ZS7ued5gd5quPggBj) \
ghc-skylighting-format-ansi-prof \
ghc-skylighting-format-ansi-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln) \
ghc-prof(containers-0.6.7) \
ghc-prof(skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63) \
ghc-prof(text-2.0.2) \
ghc-skylighting-format-ansi-devel"

inherit rpm
