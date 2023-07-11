SUMMARY = "Haskell safe library documentation"
DESCRIPTION = "This package provides the Haskell safe library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-doc-0.3.19-4.6.noarch.rpm"
RPM_HASH = "dcc68a85ca707707af8783b1be0fd1d62a462e72ea62f402a830c1bb47ec99c8b9b495a3de02aebb3a54754a96555e65e15ac4052c44ecdf78fb63d01a4be20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
