SUMMARY = "Haskell prettyprinter-ansi-terminal library development files"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal library \
development files."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-devel-1.1.3-2.3.aarch64.rpm"
RPM_HASH = "d69dd163d3c96ec960c7b6643a7b406aa7e831dce44d38a83dd8769c8fb5cb782b018e7a4ba3e8ec553c5977785962e7558070a66b07d550d5cfca9b83f3778d"

RPROVIDES:${PN} += "ghc-devel-prettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2 \
ghc-prettyprinter-ansi-terminal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-devel-text-2.0.2 \
ghc-prettyprinter-ansi-terminal"

inherit rpm
