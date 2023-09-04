SUMMARY = "Haskell prettyprinter-ansi-terminal library documentation"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-doc-1.1.3-2.3.noarch.rpm"
RPM_HASH = "d11a9abf0650e343f343c2f1a546a564cbd3be6fe7b01f299571a0771a58c7ca7b9965de32d5f77df2e356bbfb53e0e4b0c3d849465c36d03cc4b14aed9ff7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
