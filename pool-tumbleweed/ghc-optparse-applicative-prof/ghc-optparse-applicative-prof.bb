SUMMARY = "Haskell optparse-applicative profiling library"
DESCRIPTION = "This package provides the Haskell optparse-applicative profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-prof-0.18.1.0-1.3.aarch64.rpm"
RPM_HASH = "15129053942f21e9c2210ccb28bc4157e6d50b4145d7cf2b7519d445ba3ddc3064bb98104716ac645fb2b32b1dfdcfdb31ca8902857956f66d87b9550fbeefff"

RPROVIDES:${PN} += "ghc-optparse-applicative-prof \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff"

RDEPENDS:${PN} += "ghc-optparse-applicative-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prof-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-prof-process-1.6.16.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
