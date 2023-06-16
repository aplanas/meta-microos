SUMMARY = "Haskell prettyprinter-ansi-terminal library development files"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal library \
development files."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-devel-1.1.3-2.2.aarch64.rpm"
RPM_HASH = "3bd8c63471173c6c5f3a8109448b4b1708400ae77f4130b1b6eb2c32499dbaf64dcb3419600c9a87ffe250e2c38f8814a99c727125b3abeb4b274b992044c011"

RPROVIDES:${PN} += "ghc-devel-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-prettyprinter-ansi-terminal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-devel-text-2.0.2 \
ghc-prettyprinter-ansi-terminal"

inherit rpm
