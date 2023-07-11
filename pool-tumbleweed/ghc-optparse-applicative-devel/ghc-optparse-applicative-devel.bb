SUMMARY = "Haskell optparse-applicative library development files"
DESCRIPTION = "This package provides the Haskell optparse-applicative library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-devel-0.18.1.0-1.3.aarch64.rpm"
RPM_HASH = "8370c709a739a0ac33cf900dfe573c956c14c1fc2d6f65d0645a824f0322766e2844f5c44a805744065adceacbcc4cdfda02e57d6433bfeeb2a923eb6b28b757"

RPROVIDES:${PN} += "ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-optparse-applicative-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-devel-prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa \
ghc-devel-process-1.6.16.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-optparse-applicative"

inherit rpm
