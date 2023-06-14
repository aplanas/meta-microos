SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.3.aarch64.rpm"
RPM_HASH = "49e79c3dd82bee2702b882751a936260ef19ee11397a56a8e32c9e74570955304b41e19c701e48b9b3e37455c51ef5fe00542548f846460ec0d235fcdaa72eb8"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-KUO5o5IaP468SqsY1Sf1SB \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-context-devel"

inherit rpm
