SUMMARY = "Haskell timerep library documentation"
DESCRIPTION = "This package provides the Haskell timerep library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-doc-2.1.0.0-1.12.noarch.rpm"
RPM_HASH = "924cee293a3ced1d54f407651903e71e0817c5a0c1d66f15572f7d689a4b3e6586f26c51a40735daf3bb6c4100a472622f34878dc1c93038f890163776d975d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timerep-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
