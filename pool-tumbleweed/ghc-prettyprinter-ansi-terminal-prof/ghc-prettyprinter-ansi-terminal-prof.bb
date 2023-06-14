SUMMARY = "Haskell prettyprinter-ansi-terminal profiling library"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-prof-1.1.3-2.2.aarch64.rpm"
RPM_HASH = "9a39ee5e0651a00d0f825bab81a4eb6849ae240ddbe64e67a52f5819d360358afc490e6ba6e98ca528a3cd93e0a1f1750a9ed3343ab1373e3c43e6a9fdd8dc6d"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal-prof \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa"

RDEPENDS:${PN} += "ghc-prettyprinter-ansi-terminal-devel \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prof-text-2.0.2"

inherit rpm
