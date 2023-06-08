SUMMARY = "Haskell binary library documentation"
DESCRIPTION = "This package provides the Haskell binary library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-doc-0.8.9.1-1.1.noarch.rpm"
RPM_HASH = "207b0bae6a81af99f894439c56be125c107b390713721f1bf36d0be245a05076279fcb9828e3590939120f7e4cebebeb8a0235e65d14abaab68ce94f6c5d8146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
