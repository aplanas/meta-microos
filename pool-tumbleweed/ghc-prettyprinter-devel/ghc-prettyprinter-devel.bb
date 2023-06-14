SUMMARY = "Haskell prettyprinter library development files"
DESCRIPTION = "This package provides the Haskell prettyprinter library development files."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-devel-1.7.1-2.2.aarch64.rpm"
RPM_HASH = "5c73e1e967cf12cb76aa5c35b47fb755688695e0f9dc38e3bf1f98638a1bfd75e540ca0f46b394780aa5100151b9b9a1155d201bcb7ab8c8b88b704272c65eb6"

RPROVIDES:${PN} += "ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prettyprinter-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-text-2.0.2 \
ghc-prettyprinter"

inherit rpm
