SUMMARY = "Haskell tar library documentation"
DESCRIPTION = "This package provides the Haskell tar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-doc-0.5.1.1-11.6.noarch.rpm"
RPM_HASH = "1bc0a60546d8172f4bd178dee95a9b356393b153cea12b904cf32b9bdb2960210b9e341e1af2b9d970bc8f942a61dfd8801e271ceb217d327dc411ccd7cc539d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
