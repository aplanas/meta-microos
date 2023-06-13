SUMMARY = "Haskell IfElse library documentation"
DESCRIPTION = "This package provides the Haskell IfElse library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-doc-0.85-4.2.noarch.rpm"
RPM_HASH = "ea637eb55a9b6e5c1117ad55d6db494be79c50f7186dc14d1a236b9ffc0fa85bccadf5cf003681c4be807db223355b8a4858760c1862d9dae3de0485b1aee1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-IfElse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
