SUMMARY = "Haskell attoparsec library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-doc-0.14.4-3.3.noarch.rpm"
RPM_HASH = "2d85061a96d0bbc456e528706974758dcae04df7899e02485b037d09f5b7f84a260cb300471303f7ce3f6f4bcce87438400900e703accc1ba28bc043542b9089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
