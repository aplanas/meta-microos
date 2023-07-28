SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4"

RPM_NAME = "ghc-skylighting-prof-0.13.4-1.1.aarch64.rpm"
RPM_HASH = "4b968fb49ae69c1805ffd5b8297e84d0393e2538d0f5554de8334213cbcf716e6cac1005851f374746c639a955dac154266da4f2972575085622ced812189bd8"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.13.4-5T99F0BkgIQGejRNYUpHqn \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-prof-skylighting-format-ansi-0.1-Bs7UZk06X7gCvm9EWhhFHl \
ghc-prof-skylighting-format-blaze-html-0.1.1-2S5li2Ic3P8IXVFqKrjQNX \
ghc-prof-skylighting-format-context-0.1.0.2-DaN7b6FAIhw69Ip8uy59f9 \
ghc-prof-skylighting-format-latex-0.1-KUWKzkdJqvB1foV6pwv6yZ \
ghc-skylighting-devel"

inherit rpm
