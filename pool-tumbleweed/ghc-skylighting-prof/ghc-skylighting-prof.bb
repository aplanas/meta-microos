SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.2.1"

RPM_NAME = "ghc-skylighting-prof-0.13.2.1-1.4.aarch64.rpm"
RPM_HASH = "4d3e3a5f09871bc4addd9adf94e7fe3ec818dfc945224d43415ee2cc3c68cc63ba16c886b0e7e0717733e97473e5a80b987fe645a76fdcf1d98106b30cfb94ac"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.13.2.1-BFihQrd5v8J7nFEx17mOBW \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-prof-skylighting-format-ansi-0.1-37mK2ZS7ued5gd5quPggBj \
ghc-prof-skylighting-format-blaze-html-0.1.1-GSLRiRB6bjcEjUjplnknYR \
ghc-prof-skylighting-format-context-0.1.0.2-KUO5o5IaP468SqsY1Sf1SB \
ghc-prof-skylighting-format-latex-0.1-BfMH5Wq0cc5AFSMLgsgxu \
ghc-skylighting-devel"

inherit rpm
