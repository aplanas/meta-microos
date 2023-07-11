SUMMARY = "Haskell clientsession library documentation"
DESCRIPTION = "This package provides the Haskell clientsession library documentation."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-doc-0.9.1.2-4.6.noarch.rpm"
RPM_HASH = "1fe9d97be69b75276047dde32eedaa6786200f80d3196062577708bab75d60aeca870e4b31fa9d77133f7183605e7eaf364ddbd38975863b2df9052b4e2575fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clientsession-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
