SUMMARY = "Haskell prettyprinter profiling library"
DESCRIPTION = "This package provides the Haskell prettyprinter profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.7.1"

RPM_NAME = "ghc-prettyprinter-prof-1.7.1-2.2.aarch64.rpm"
RPM_HASH = "38ed5f3fa17badd9c80e96538f29d55a6aed5f8aed3aa9aa22cdb6e26e9bf2f7e0662a2392fef621c878a1a3c13fdec29bf920f161629c160e5b7c634195427e"

RPROVIDES:${PN} += "ghc-prettyprinter-prof \
ghc-prettyprinter-prof(aarch-64) \
ghc-prof(prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2)"

RDEPENDS:${PN} += "ghc-prettyprinter-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(text-2.0.2)"

inherit rpm
