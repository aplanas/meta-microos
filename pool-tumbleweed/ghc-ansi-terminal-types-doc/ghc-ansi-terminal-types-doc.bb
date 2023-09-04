SUMMARY = "Haskell ansi-terminal-types library documentation"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-doc-0.11.5-1.3.noarch.rpm"
RPM_HASH = "91dffa667c578157d2234b44e78fda1b89a9630a74a1b11f383a921c3189353089b744e786994386078d24522c3c3e824a599386ffea278a5aab5e0c4d457b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
