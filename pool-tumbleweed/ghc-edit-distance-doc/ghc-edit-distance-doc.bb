SUMMARY = "Haskell edit-distance library documentation"
DESCRIPTION = "This package provides the Haskell edit-distance library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-doc-0.2.2.1-13.3.noarch.rpm"
RPM_HASH = "9f6be0bba46f8b039e8d0f5d2b42dc1112801a97ae1fc4001644bce9e228c75e4e0c35895a9f1416ff97c71ed3d69e87e6de9b665f2d5ebc82787c368e82ceca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-edit-distance-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
