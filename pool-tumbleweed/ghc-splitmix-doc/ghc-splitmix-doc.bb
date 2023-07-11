SUMMARY = "Haskell splitmix library documentation"
DESCRIPTION = "This package provides the Haskell splitmix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-doc-0.1.0.4-4.6.noarch.rpm"
RPM_HASH = "4c7378f4e48569d2090373e9412e96fb19e225a9d8af5b8285dabfebf206532d7e90903b577d388e61917c902e1828162db5bb2d8b0057adf7b8d66c1ece43f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-splitmix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
