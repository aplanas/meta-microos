SUMMARY = "Haskell persistent-sqlite library documentation"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library documentation."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-doc-2.13.1.1-2.14.noarch.rpm"
RPM_HASH = "22105544c2a005c2a14e9cfdf27701796114832b763f0d4b798532adc1274d95929692adc9423f481a5e6d338e37fa714697af82ee258f1cbca8d2777a01b1f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-sqlite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
