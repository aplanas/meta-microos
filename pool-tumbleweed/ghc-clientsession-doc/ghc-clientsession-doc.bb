SUMMARY = "Haskell clientsession library documentation"
DESCRIPTION = "This package provides the Haskell clientsession library documentation."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-doc-0.9.1.2-4.3.noarch.rpm"
RPM_HASH = "6310dd55b61dd23efaf87d506ed14546b1fd64ff2b874da8034c6a839da35685d609e686f1d493c4cbead5ee88b921d6652212bf1a8c84b78458cc87b27d8086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clientsession-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
